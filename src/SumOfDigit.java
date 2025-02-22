import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer with at least 2 digits");
        String  number = input.nextLine();

        int sum = 0;
        for(int i = 0; i < number.length(); i++) {

            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        System.out.println("The sum of the your number is: " + sum );
      input.close();
    }
}
