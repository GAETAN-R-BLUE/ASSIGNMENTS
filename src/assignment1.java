/* ******************************************************************************
 *  Given a list of integers, return a list where each element is 1 if the
 * corresponding integer is a power of two and 0 otherwise.
 * RODRIGUE GAETAN 01/01/1111
 * ******************************************************************************/
import java.util.Scanner;

import static java.lang.Math.log;

public class assignment1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number"); // This number will represent the interval from 0 to the number.

        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {

           double result =(Math.log(i) / Math.log(2)) ;
           if(result % 2 == 0){
            System.out.print("1");
            }
           else {
               System.out.print("0");
           }
        }
        scan.close();
    }
}
