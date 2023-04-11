import java.util.Random;
import java.util.Scanner;

//Mia Escoto 
// project 7-2 
// computer will guess user number 1-100

public class numberGuesser{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int num;
        int guessed;
        int guessCount =0; 
        int min = 1;
        int max = 100;
        
        while(true){
            System.out.println("Enter a number between 1-100 for the computer to guess");
            num = scan.nextInt();
            if (num < 100 || num > 0){
                break;
            }
            System.out.println("Please enter a number in range");
        }
        
        while(true){
            guessCount ++;
            guessed = rand.nextInt(max-(min-1)) + min+1;
            System.out.println("Guess: " + guessed);
            if (guessed>num){
                System.out.println("Number is less.");
                max = guessed;
            }
            else if(guessed<num){
                System.out.println("Number is more.");
                min = guessed;
            }
            else{
                System.out.println("NUMBER GUESSED in "+ guessCount + " guesses");
                break;
            }
        }
            
    }
}