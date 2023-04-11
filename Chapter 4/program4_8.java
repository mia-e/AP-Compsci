//Mia Escoto
//Returns 2^input 
//4-7

import java.util.Scanner;

public class program4_8{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        //declare variable
        int exp; 
        int base;
        
        System.out.println("Enter a base: ");
        base = scan.nextInt();
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
        
        System.out.println(Math.pow(base, exp));
        
        
        
        
    }
}