//Mia Escoto 
//calculates the cost of a call 
//4.3

import java.util.Scanner;

public class program4_3{
    public static void main(String args[]){
        //instatiate obj 
        Scanner scan = new Scanner(System.in);
        //declare variables
        int min;
        double cost = 1.15;
        
        //get input
        System.out.println("Enter total minutes of call: ");
        min = scan.nextInt();
        
        //get extra min
        min -=2;
        
        //price per min
        for (int i =0; i < min; i++)
               cost += .5;
               
        //output
        System.out.println("Total Cost: $"+ cost);
        
        
    }
}