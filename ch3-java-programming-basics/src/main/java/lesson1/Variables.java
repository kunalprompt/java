package lession1;

public class Variables{
    private int number;
    private float numFloat;
    private double numDouble;
    private String name;

    // check the magics -  data types are the storage space - values stored in them
    // ASCII conversions happen here while formatting the data (like conversion to character).
    private int assign = 'c';
    private char a = 65;

    public Variables(int number, float numFloat, double numDouble, String name){
        this.number = number;
        this.numFloat = numFloat;
        this.numDouble = numDouble;
        this.name = name;
    }

    public String printData(){
        System.out.println("See the difference here --- " + assign + " -- " + a);
        return "Number: " + number + " Float: " + numFloat + " Double: " + numDouble + " Name: " + name;
    }
}