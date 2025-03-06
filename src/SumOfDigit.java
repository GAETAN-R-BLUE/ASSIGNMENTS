import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer with at least 2 digits");
        String  userInput = new Scanner(System.in).nextLine();
        int number = 0;
        for(int i = 0; i < userInput.length();i++){
        number += Integer.parseInt(String.valueOf(userInput.charAt(i)));
        }
       System.out.println(("The sum of the digits of your number is: " + number));
    }
}
