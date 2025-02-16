import java.util.Scanner;
import java.util.StringTokenizer;

public class day5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word to be counted:");
        String word = input.nextLine();
        System.out.println();
        System.out.println("Your word has " + word.length() + " character");
        System.out.println(word.charAt(0));
        for(int i =0; i<word.length();i++){
            char c = word.charAt(i);
         //   StringTokenizer w = new StringTokenizer(word,"");
        //    String w = word.nextToken();

            System.out.print(c);
        }
        input.close();
    }
}
