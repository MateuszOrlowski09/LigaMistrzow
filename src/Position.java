
public class Position {
    private String line;
    private String wing;
    private String task;


    public Position(String line, String wing, String task) {
        this.line = line;
        this.wing = wing;
        this.task = task;
    }

    public String getLine() {
        return line;
    }

    public String getTask() {
        return task;
    }

    public String getWing() {
        return wing;
    }
}
