/* *****************************************************************
 * This program ask the user for 3 numbers and compares them to find the
 * smallest, then display the smallest to the end user.
 * Date: 01/01/1111
 * ********************************************************************/
import java.util.Scanner; // Importing the scanner object

public class SmallestNumber {
    public static void main(String[] args) {

        System.out.println("Enter 3 number integer separated with coma:"); // Prompts the user for the numbers
        String [] numbersArray = new Scanner(System.in).nextLine().split(","); // splitting the user input
        int [] numArray = new int[numbersArray.length]; // declaring a new array where I will store my variable

        // the next for loop attributes all the element of my array of type int, and find the smallest
        for(int i = 0; i < numbersArray.length; i++) {
            numArray[i] = Integer.parseInt(numbersArray[i]);
        }
        int smallest = numArray[0]; // initializing my smallest value with the first element of my array
            for(int i = 0; i < numbersArray.length; i++) {

                if (smallest > numArray[i]) {
                    smallest = numArray[i];
                }
            }
        System.out.println( "The smallest number is: " + smallest);

    }
}
