//Mia Escoto 
// gives surface area of a cub e
//3_1 

import java.util.Scanner;

public class program3_1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        //declare variables 
        int edge;
        int surfaceArea;
        
        //take user input 
        System.out.println("Please enter the length of a cube edge");
        edge = scan.nextInt();
        
        //calculate
        surfaceArea = edge * edge * 6;
        
        //print out
        
        System.out.println("The surface area of a cub is "+ surfaceArea);
    }
}