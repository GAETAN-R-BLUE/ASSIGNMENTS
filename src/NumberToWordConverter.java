import java.util.Scanner;

public class NumberToWordConverter {
    public static void main(String[] args) {
        System.out.println("Enter a number a positive integer ");
        int number = new Scanner(System.in).nextInt();

        switch (number) {
            case 0:
                System.out.println("0 = Zero");
                break;
            case 1:
                System.out.println("1 = one");
                break;
            case 2:
                System.out.println("2 = two");
                break;
            case 3:
                System.out.println("3 = three");
                break;
            case 4:
                System.out.println("4 = four");
                break;
            case 5:
                System.out.println("5 = Five");
                break;
            case 6:
                System.out.println("6 = Six");
                break;
            case 7:
                System.out.println("7 = Seven");
                break;
            case 8:
                System.out.println("8 = Eight");
                break;
            case 9:
                System.out.println("9 = Nine");
                break;
            case 10:
                System.out.println("10 = Ten");
                break;

        }
    }
}
