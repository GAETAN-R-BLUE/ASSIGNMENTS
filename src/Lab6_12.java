// This program take some string variable from user, convert
// it in to numbers and display the average and the largest

import java.util.Scanner;

public class Lab6_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number in your list:"); // Prompts the user input
        String numbers = input.nextLine(); // Accepts the user input as a string variable
        System.out.println();
        System.out.println("You entered: "+ numbers); // Displays the user inputs
        String[] Array = numbers.split(" "); // splitting the string into an array
        System.out.println();

        double [] newArray = new double[Array.length]; // Declaring the new array that will house my integers

        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = Double.parseDouble(Array[i]); // converting the String array into double array
        }
            double sum = 0; // sum
            double largest = newArray[0]; // initializing the largest value with the first number in the newArray

        // The following calculate the sum in
        // newArray and determine the largest

            for(int i = 0 ; i < newArray.length; i++){
               sum += newArray[i];
               if(largest < newArray[i]){
                   largest = newArray[i];
               }
            }
        System.out.println("The largest number in you list is " + largest + " and the average is " + (sum/newArray.length));
        input.close();
    }
}
