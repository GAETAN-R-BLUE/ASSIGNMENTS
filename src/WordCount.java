// This program counts houw many words are in a sentence
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        System.out.println("Type your full sentence");
        String [] sentence = new Scanner(System.in).nextLine().split(" ");
        System.out.println("your sentence has " + sentence.length + " words");
    }
}
