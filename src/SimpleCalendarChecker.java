import java.util.Scanner;

public class SimpleCalendarChecker {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter an integer corresponding to the date or 0 to exit.");
            int choice = new Scanner(System.in).nextInt();
            if (choice < 0 || choice > 7) {
                System.out.println("Try again, invalid input");
                continue;
            }
            if (choice == 0) {
                break;
            } else {
                switch (choice) {
                    case 1: {
                        System.out.println("1 = Monday");
                        break;
                    }
                    case 2: {
                        System.out.println("2 = Tuesday");
                        break;
                    }
                    case 3: {
                        System.out.println("3 = Wednesday");
                        break;
                    }
                    case 4: {
                        System.out.println("4 = Thursday");
                        break;
                    }
                    case 5: {
                        System.out.println("5 = Friday");
                        break;
                    }
                    case 6: {
                        System.out.println("6 = Saturday");
                        break;
                    }
                    case 7: {
                        System.out.println("7 = Sunday");
                        break;
                    }
                }
            }
        }
    }
}

