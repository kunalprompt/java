/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import main.java.pkg.subpkg1.HelloIndia;
import main.java.pkg.subpkg2.HelloWorld;

public class App {
    public String getGreeting() {
        return "Greetings";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        new HelloWorld().sayHi();
        new HelloIndia().sayHi();
    }
}
