//Mia Escoto 
// project 7-1 
// User guesses a computer generated number between 1 - 100

import java.util.Scanner;
import java.util.Random;


public class guessNumber{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(101) + 1;
        int guessed; 
        int guess_count = 0;
        
        System.out.println("Im thinking of a number between 1 and 100\n ");
        while(true){
            System.out.println("Guess number: ");
            guessed = scan.nextInt();
            if(guessed <0 || guessed >100){
                System.out.println("Please enter a number between 0 - 100");
            }
            guess_count ++;
            if (guessed > num)
                System.out.println("No, the number is less");
            else if(guessed < num)
                System.out.println("No, the number is more");
            else if(guessed == num){
                System.out.println("You guessed it!");
                break;
            }

        }
        
    }
}