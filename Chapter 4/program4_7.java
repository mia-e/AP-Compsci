//Mia Escoto
//Returns 2^input 
//4-7

import java.util.Scanner;

public class program4_7{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        //declare variable
        int exp; 
        final int BASE = 2;
        
        while(true){
            System.out.println("Enter an exponent: ");
            exp = scan.nextInt();
            
            //error check
            if(exp < 0){
                System.out.println("Enter positive integers only.");
                continue;
            }
            break;
        }
        System.out.println(Math.pow(BASE, exp));
        
        
        
        
    }
}