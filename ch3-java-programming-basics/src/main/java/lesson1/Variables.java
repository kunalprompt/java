package lession1;

public class Variables{
    private int number;
    private float numFloat;
    private double numDouble;
    private String name;

    public Variables(int number, float numFloat, double numDouble, String name){
        this.number = number;
        this.numFloat = numFloat;
        this.numDouble = numDouble;
        this.name = name;
    }

    public String printData(){
        return "Number: " + number + " Float: " + numFloat + " Double: " + numDouble + " Name: " + name;
    }
}