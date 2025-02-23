/* ******************************************************************************
 *  Given a list of integers, return a list where each element is 1 if the
 * corresponding integer is a power of two and 0 otherwise.
 * RODRIGUE GAETAN 01/01/1111
 * ******************************************************************************/
import javax.management.StringValueExp;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.log;

public class assignment1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a list numbers separated with coma"); // This number will represent the interval from 0 to the number.
        String num = scan.nextLine();

        String [] numberArrays = num.split(",");

        double result = 0;
        int [] number = new int[numberArrays.length];
        for(int i = 0; i < numberArrays.length; i++){
            number[i] = Integer.parseInt(numberArrays[i]);
            result =(Math.log(number[i]) / Math.log(2)) ;
            if (result % 1 == 0){
                System.out.print("0");
            }
            else {
                System.out.print("1");
            }
        }
        scan.close();
    }
}
