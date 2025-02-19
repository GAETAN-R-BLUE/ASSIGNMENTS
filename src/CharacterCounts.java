/******************************************************
 * This program prompts the user for a sentence, counts
 * the number of vowels in the sentence and display the
 * vowels count to the console.-----------------------
 * 01/01/1111, Rodrigue Gaetan Gansob
 * ****************************************************/
import java.util.Scanner;
public class CharacterCounts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = input.nextLine();

        int vowelCount = 0; // variable to track how many vowels initialized
        for (int i = 0; i < sentence.length(); i++ ){
            char character = sentence.charAt(i);
            if (character == 'a' || character=='e'|| character == 'i'||character == 'o'||character == 'u'){
                vowelCount++; // tracks the number of vowels
            }
        }
        if(vowelCount == 1){
            System.out.println("your sentence has " + vowelCount + " vowel");
        }
        else if(vowelCount == 0){
            System.out.println( "Your sentence has no vowels");
        }
        else {System.out.println("your sentence has " + vowelCount + " vowels");
        input.close();}
    }
}
