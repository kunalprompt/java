package lesson1;

public class MyNumericArray {

    private int[] numArray = {};
    private int filled_spaces = 0;

    private static final int min_number = -99999;

    public void MyNumericArray(){
        System.out.println("Only unique, integer array where elements > -99999 can be generated");
    }

    public void createArray(int len){
        filled_spaces = 0;
        if (len > 0){
            numArray = new int[len];
            for(int i=0; i < len; i++){
                numArray[i] = min_number;
            }
        } else{
            System.out.println((char)27 + "[31m" + "Minimum array length has to be greater than 0." + (char)27 + "[0m");
        }
    }

    public int addNumber(int number){
        int len = numArray.length;
        if(len > 0 && filled_spaces < len){
            for(int i = 0; i < len; i++){
                if (numArray[i] == min_number){
                    numArray[i] = number;
                    filled_spaces += 1;
                    break;
                }
            }
            System.out.printf((char)27 + "[32m" + "Element %d inserted successfully.\n" + (char)27 + "[0m", number);
        } else{
            System.out.printf((char)27 + "[31m" + "Failed to insert %d element. No space available.\n"
                    + (char)27 + "[0m", number);
            return -1;
        }
        return 0;
    }

    public int deleteNumber(int number){
        int len = numArray.length;
        if(len > 0 && filled_spaces > 0){
            for(int i = 0; i < len; i++){
                if (numArray[i] == number){
                    numArray[i] = min_number;
                    filled_spaces -= 1;
                    break;
                }
            }
            System.out.printf((char)27 + "[32m" + "Element %d deleted successfully.\n"
                    + (char)27 + "[0m", number, number);
        } else{
            System.out.printf((char)27 + "[31m" + "Failed to delete element %d.\n" + (char)27 + "[0m", number);
            return -1;
        }
        return 0;
    }

    public void print(){
        int len = numArray.length;
        if(len > 0){
            for(int i = 0; i < len; i++){
                System.out.print((char)27 + "[33m" + numArray[i] + " " + (char)27 + "[0m");
            }
            System.out.println();
        }
    }
}
