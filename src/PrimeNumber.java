import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){ int count = 0;
            System.out.println("Enter a number");
            int number = input.nextInt();
            if (number <= 0){
                System.out.println("incorrect entry, try again");
            }
            else {
                for(int i = 1; i <= number; i++){
                    if (number % i == 0){
                        count++;
                    }
                }
                if(count == 2){
                    System.out.println(number + " is a prime number");
                }
                else {
                    System.out.println(number + " is not a prime number");
                }
                break;
            }
        }
         input.close();
    }
}
