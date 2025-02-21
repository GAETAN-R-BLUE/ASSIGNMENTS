// this program find the largest number out of 3 given by the user.
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 3 number separated by space:");
        String  stringNumbers = input.nextLine();

        String [] numbers = stringNumbers.split(" ");
        int [] integerNumber = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            integerNumber[i] = Integer.parseInt(numbers[i]);
        }
        int largest = integerNumber[0];
        for (int i = 0; i < numbers.length; i++){
            if(largest < integerNumber[i]){
                largest = integerNumber[i];
            }
        }
        System.out.println("The largest is: " + largest);
 input.close();
    }
}
