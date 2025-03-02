import java.util.Scanner;
public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("Enter a positive integer:");
        int userInput = new Scanner(System.in).nextInt();

        for( int i = 1; i <= userInput; i++ ){
            if (i % 15 == 0){
                System.out.println("FIZZBUZZ");
            }
             else if (i % 5 == 0){
                System.out.println("BUZZ");
            }
            else if (i % 3 == 0){
                System.out.println("FIZZ");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
