/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import lesson1.FirstLesson;


public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

        FirstLesson.main();
    }
}
