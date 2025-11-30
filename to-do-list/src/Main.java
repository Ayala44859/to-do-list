
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Task task1= new Task("123","HomeWork","To do Home work in math",Status.NEW);
        Task task2= new Task("456"," To finish a project","To finish the new project",Status.IN_PROGRESS);
        Task task3= new Task("789","To write an article","To write an article for the weekly magazine",Status.DONE);

        List<Task> tasks =new ArrayList<>();
        List<Task> TaskRepository=new ArrayList<>();

// -------   Adding tasks to a list  -------

        TaskRepository taskRepositories = new TaskRepository();
        taskRepositories.AddTask(task1);
        taskRepositories.AddTask(task2);
        taskRepositories.AddTask(task3);

        TaskService taskService = new TaskService();



// -------   Update a task in a list  -------

//        taskRepositories.UpdateTask("123",task2);

// -------   Deleting a task from the list  -------

        taskRepositories.DeleteTask(task1);

// -------   Get Task By Id  -------

        taskRepositories.GetTaskById("789");

// -------   Print all task details  -------

        taskRepositories.ListAll();

// -------   Marking a task as done  -------

        taskService.MarkingATaskAsDone(task3);

// -------   Print all task details  -------

        taskService.SearchForTasksByText("To finish a project");

//    ---- Return a list of tasks sorted by status  ------

        taskService.taskListByStatus(Status.DONE);
    }

}