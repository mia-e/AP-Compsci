//Mia Escoto 
//predicts total population 
//project 4-6

import java.util.Scanner;

public class program4_6{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       
       //declare variables
       int organisms;
       int growth_rate;
       int hourPerRate;
       int totalHours;
       
       
       //take input
       System.out.println("Enter organisms: ");
       organisms = scan.nextInt();
       
       System.out.println("Growth Rate: ");
       growth_rate = scan.nextInt();
       
       System.out.println("Hours to acheive rate: ");
       hourPerRate = scan.nextInt();
       
       System.out.println("Total hours for population to grow: ");
       totalHours = scan.nextInt();
       
       //multiply by rate 
       for(int i = 0; i < totalHours; i+=hourPerRate)
           organisms *= growth_rate;
       
       System.out.println("Total Population: "+organisms);    
        
        
    }
}