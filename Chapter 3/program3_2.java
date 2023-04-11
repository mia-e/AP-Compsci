//Mia Escoto
//takes radius and returns circumfrence diameter and volume 
//3_2

import java.util.Scanner;

public class program3_2{
    public static void main(String args[]){
        //instantiating object
        Scanner scan = new Scanner(System.in);
        
        //declaring variables
        double radius; 
        double circumference; 
        double diameter; 
        double surfaceArea; 
        double volume; 
        
        //get user input 
        System.out.println("Enter radius: ");
        
        //calculate 
        radius = scan.nextInt();
        diameter = radius * 2; 
        circumference = 2* 3.14 * radius; 
        surfaceArea = 4*3.14*Math.pow(radius, 2);
        volume = (4/3)* 3.14 * Math.pow(radius, 3);
        
        //print out
        System.out.println("Diameter:" + diameter +"\nCircumference: "+ circumference + "\nSurface Area: "+ surfaceArea + "\nVolume: "+ volume);
        
    }
}