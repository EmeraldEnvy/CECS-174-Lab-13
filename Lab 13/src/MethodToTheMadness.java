import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.util.Scanner;
public class MethodToTheMadness {

    public static boolean isIncreasing(int[] values){
        //Finds length of
        int length = values.length;
        for (int i=0; i<length-1 ; i++){
            //Compares the a value with its next value
            if (values[i]>=values[i+1]){
                //Returns false if next value is smaller
                return false;
            }
        }
        //Returns true loop succeeds
        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Set array to 5
        int[] integers = new int[5];
        //Loop the input
        for (int i=0; i<5; i++){
            System.out.println("Enter a value");
            int number = input.nextInt();
            //Changes each value in the list as i increases
            integers[i] = number;
        }
        //Outputs
        boolean increasing = isIncreasing(integers);
        //Numbers are increasing order
        if (increasing == true){
            System.out.println("The numbers are in increasing order");
        }
        //Numbers are not in increasing order
        else{
            System.out.println("The numbers are not in increasing order");
        }

    }
}
