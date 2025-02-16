import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word to be checked:");
        String word = input.nextLine();
        System.out.println(word);
        System.out.println();

        int size = word.length();

        for (int i = size - 1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
        String newword = "i";
        System.out.println(newword);
    }
}
