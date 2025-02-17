/* **************************************************************
 * This program prompts the user for a sentence, count the number
 * of words in the sentence and display the words count.
 * Rodrigue Gaetan
 * 01/01/1111
 ****************************************************************/
import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your sentence here:"); // Prompt the user for the sentence
        String sentence = input.nextLine(); // Accept the user input
        System.out.println(); //goes to the next line

        String [] array = sentence.split(" "); //Splitting the sentence into words
        int count = 0; // counting the number of words in my sentence
        for(int i =0; i < array.length; i++){
            count++;
        }
        System.out.println("Your sentence has "+ count + " words");

        input.close();
    }
}
