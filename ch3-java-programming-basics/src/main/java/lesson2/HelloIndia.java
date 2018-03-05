package lesson2;

public class HelloIndia{

    public int var = 0;

    public HelloIndia(String yes){  // constructor
        if (yes == "yes"){
            var = 1;
        }
    }

    public void sayHi(){
        if (var == 1){
            System.out.println("Hiii! :)");
        } else{
            System.out.println(":( Can't say Hi!");
        }
    }

    public static void sayHello(){ // Remember: a non-static variable "var" cannot be accessed from static context
        System.out.println("Hellewww! :)");
    }
}
