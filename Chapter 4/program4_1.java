//Mia Escoto 
//takes 2 inputs, divides and returns quotient and remainder
//program 4.1

import java.util.Scanner;

public class program4_1{
    public static void main(String args[]){
        //instatiate objs
        Scanner scan = new Scanner(System.in);
        
        //declare variables 
        int dividend;
        int divisor;
        int quotient;
        int remainder;
        
        while(true){
            //take input
            System.out.println("Enter Dividend: ");
            dividend = scan.nextInt();
            
            System.out.println("Enter Divisor: ");
            divisor = scan.nextInt();
            
            //error check
            if (divisor ==0 || divisor > dividend){
                System.out.println("Divisor cannot equal 0 or be larger than the dividend");
                continue;
            }
            else{
                break;
            }
        }
        quotient = dividend/divisor;
        remainder = dividend%divisor;
        System.out.println(quotient + "r. " + remainder);
    }
}
