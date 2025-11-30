
import java.util.ArrayList;
        import java.util.List;
        import java.util.stream.Stream;


public class TaskRepository {

  List<Task> TaskRepository=new ArrayList<>();

//    ---- Add  ------

    public void AddTask(Task task){
        TaskRepository.add(task);
        System.out.println("task added");
    }

    //    ---- Update  ------
    public void UpdateTask(String id, Task taskToUpdte) {

        for (Task task1:TaskRepository){
           if (task1.getId().equals(id)) ;
            TaskRepository.set(Integer.parseInt(task1.getId()), taskToUpdte);
            return;
        }
            System.out.println("task updated");
        }


    //    ---- Delete  ------
    public void DeleteTask(Task task){
        if (TaskRepository.contains(task)){
            TaskRepository.remove(task);
            System.out.println("task deleted");
        }
    }

    //    ---- GetById  ------
    public Stream<Task> GetTaskById(String id){
        Stream<Task> taskById= TaskRepository.stream().filter(task -> task.getId().equals(id));
        System.out.println("get task");
        return taskById;
    }


    //    ---- ListAll  ------
    public void ListAll(){
        for (Task task1 : TaskRepository)
            task1.getDetails();
        System.out.println("list All");
    }

}
