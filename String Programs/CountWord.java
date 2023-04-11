import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();

        String[] words = sentence.split(" ");
        int wordCount = words.length;

        System.out.println("number of words: " + wordCount);
    }
}