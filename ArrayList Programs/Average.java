//Mia Escoto 

//Mia Escoto 
//Ch 10 problems 
//Gets the Average of a list

import java.util.Scanner;

public class Average{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double numList[] = new double[10];
    
        for(int i =0; i<10; i++){
            System.out.println("Enter any double");
            double n = scan.nextDouble();
            numList[i] = n;
        }
        
        double average = getAverage(numList);
        
        System.out.println("Average: "+ average);
        
        System.out.print("Numbers greater than average: ");
        for(int i =0; i<10; i++){
            if (numList[i] > average){
                System.out.print(numList[i] + ", ");
            }
        }
        
        
    }
    public static double getAverage(double list[]){
        double average;
        double total = 0;
        for(int i =0; i< list.length; i++){
            total += list[i];
        }
        average = total/list.length;
        return average;
    }    
}
