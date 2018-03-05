package lesson2;


public class Singleton{

    private static Singleton instance = null;
    private int instanceValue = 0;

    private Singleton(){}

    public static Singleton setInstance(){
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public static void checkSingletonInstanceStatus(){
        if (instance == null)
            System.out.println("No singleton instance present.");
        else
            System.out.println("Yay, there is a singleton instance.");
    }

    public void setInstanceValue(int value){
        instanceValue = value;
    }

    public int getInstanceValue(){
        return instanceValue;
    }
}
