package study.randomTasks;

public class Task_4 {
    public static void main(String[] args) {
        String template = "Hello, %s!";
        String result = template.formatted("World");
        System.out.println(result);
    }

}
