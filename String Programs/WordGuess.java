import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        String word = "mouse";
        int length = word.length();
        int errors = 0;
        boolean[] rightGuessed = new boolean[length];
        char[] temp = new char[length];
        for (int i = 0; i < length; i++) {
            temp[i] = '*';
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("The word has " + length + " letters.");
        System.out.println("Secret word: " + new String(temp));

        while (errors < 7 && !checkCorrect(rightGuessed)) {
            System.out.print("Guess letter: ");
            char letter = scan.next().charAt(0);
            boolean found = false;
            for (int i = 0; i < length; i++) {
                if (word.charAt(i) == letter) {
                    System.out.println("Correct! The letter '" + letter + "' index: " + i + ".");
                    rightGuessed[i] = true;
                    temp[i] = letter;
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Wrong. The letter '" + letter + "' not in  word.");
                errors++;
            }
            System.out.println("Secret word: " + new String(temp));
        }

        if (errors == 7) {
            System.out.println("You used up your guesses.");
        } else {
            System.out.println("You found all the letters.");
        }
    }

    public static boolean checkCorrect(boolean[] rightGuessed) {
        for (boolean b : rightGuessed) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}