package lesson1;


public class FirstLesson {

    public static void main() {

        System.out.println("Playing with Variables - ");

        lession1.Variables vr = new lession1.Variables(12, 3.5F,
                8889.5D, "KunalPrompt");

        System.out.println(vr.printData());

        System.out.println("Playing with a custom Numeric Array - ");

        MyNumericArray mna = new MyNumericArray();

        mna.createArray(-1);

        mna.createArray(5);

        mna.print();

        mna.addNumber(10);
        mna.addNumber(20);
        mna.addNumber(30);
        mna.addNumber(40);
        mna.addNumber(50);
        mna.addNumber(60);

        mna.print();

        mna.deleteNumber(10);
        mna.deleteNumber(20);
        mna.deleteNumber(30);
        mna.deleteNumber(40);
        mna.deleteNumber(50);
        mna.deleteNumber(60);

        mna.print();
    }
}
