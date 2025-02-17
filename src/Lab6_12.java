// This program take some string variable from user, convert
// it in to numbers and display the average and the largest

import java.util.Scanner;

public class Lab6_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number in your list:");
        String numbers = input.nextLine();
        System.out.println();

        System.out.println("You entered: "+ numbers);
        String[] Array = numbers.split(" ");
        System.out.println();

        double [] newArray = new double[Array.length];
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = Double.parseDouble(Array[i]);
        }
            double sum = 0;
            double largest = newArray[0];
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
