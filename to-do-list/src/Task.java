import jdk.net.SocketFlow;

public class Task {
    private String id;
    private String title;
    private String description;
    private Status status;


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public Task(String id, String title, String description, Status status){
        this.id=id;
        this.title=title;
        this.description=description;
        this.status=status;

    }

    public String getDetails() {
        return "Task{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
