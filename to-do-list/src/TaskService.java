import java.util.ArrayList;
import java.util.List;

public class TaskService{
    List<Task> TaskRepository = new ArrayList<>();
    List<TaskRepository> TaskService = new ArrayList<>();

    //    ---- Marking a task as done  ------

    public void MarkingATaskAsDone(Task task){
       task.setStatus(Status.DONE);
    }


    //    ---- Search for tasks by text appearing in the title or description  ------

    public void SearchForTasksByText(String textToSearch){
            for (Task task1 :TaskRepository){
             if (  task1.getTitle().equals(textToSearch) || task1.getDescription().equals(textToSearch)) {
                 System.out.println(task1.getDetails());
             } else
                 System.out.println("No task found with the title/ description "+ textToSearch);
            }
        }

    //    ---- Return a list of tasks sorted by status  ------

    public List<Task> taskListByStatus(Status status) {
        List<Task> listOfTasksByStatus = new ArrayList<>();
        for (Task task1 : TaskRepository) {
            listOfTasksByStatus = (List<Task>) TaskRepository.stream().map(task2 -> task2.getStatus().equals(status));
        }
        return listOfTasksByStatus;

    }
    }
