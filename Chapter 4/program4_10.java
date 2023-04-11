//Mia Escoto 
//displays salary schedule for teachers in a school district 
//4-10

import java.util.Scanner;

public class program4_10{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        //declare variables 
        double rate;
        double startingSalary;
        int yearsTeaching; 
        double bonus;
        
        //get & assign variables
        System.out.println("Enter starting salary: ");
        startingSalary = scan.nextDouble();
        
        System.out.println("Enter increase percent: ");
        rate = scan.nextDouble();
        rate /= 100;
        
        System.out.println("Enter years teaching: ");
        yearsTeaching = scan.nextInt();
        
        for(int i = 0; i<yearsTeaching; i++){
            bonus = rate * startingSalary;
            for(int j =0; j<i; j++){
                startingSalary+=bonus;
            }
            System.out.println("Year: "+ i+ "Salary: $" + Math.round(startingSalary * 100.0)/100);
        }
            
        
    }
}