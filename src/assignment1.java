/* ******************************************************************************
 *  Given a list of integers, return a list where each element is 1 if the
 * corresponding integer is a power of two and 0 otherwise.
 * RODRIGUE GAETAN 01/01/1111
 * ******************************************************************************/
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a list numbers separated with coma"); // Prompts the user for a list of numbers separated with coma
        String num = scan.nextLine();

        String [] numberArrays = num.split(","); // Splits my string variable into a sting array with each element representing a number

        double result = 0;
        int [] number = new int[numberArrays.length]; // creating a new array
        for(int i = 0; i < numberArrays.length; i++){
            number[i] = Integer.parseInt(numberArrays[i]); //attributing each element of my array
            result =(Math.log(number[i]) / Math.log(2)) ; // looping through my array and determining if each number is a power of 2 or not
            if (result % 1 == 0){
                System.out.print("1");  // display the output: 0 if the number is a power of 2 and 1 otherwise.
            }
            else {
                System.out.print("0");
            }
        }
        scan.close();
    }
}
