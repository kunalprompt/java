package lesson2;

import lesson2.HelloIndia;
import lesson2.Singleton;


public class SecondLesson{
    public static void main(){

        // HelloIndia Example
        HelloIndia.sayHello();  // static method doesn't require an instance of a class
        HelloIndia var = new HelloIndia("");
        var.sayHi();

        // Example Singleton Class
        Singleton.checkSingletonInstanceStatus();
        Singleton sgl = Singleton.setInstance();
        sgl.checkSingletonInstanceStatus();
        sgl.setInstanceValue(10);
        System.out.println("sgl instance value - " + sgl.getInstanceValue());

        Singleton war = Singleton.setInstance();
        war.checkSingletonInstanceStatus();
        war.setInstanceValue(20);
        System.out.println("war instance value - " + war.getInstanceValue());

        System.out.println("sgl instance value - " + sgl.getInstanceValue());
    }
}
