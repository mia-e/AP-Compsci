//Mia Escoto
//displays employee's total weekly pay 
//3_5

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class program3_5{
    public static void main(String args[]){
        //instantiate objects 
        Scanner scan = new Scanner(System.in);
        ArrayList<String> days_of_week = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"));
        
        
        //declare variables 
        double hourly_wage;
        double total_weekly_pay;
        double overtime_pay;
        int total_reg_hours = 0;  
        int total_overtime_hours = 0;
        
        //user input
        
        System.out.println("Hourly Wage: ");
        hourly_wage = scan.nextDouble();
        
        for (int i =0; i < days_of_week.size(); i++){
            //iterate over each day of the week and take the total hours worked 
            System.out.println("Regular Hours for " + days_of_week.get(i) + ": ");
            total_reg_hours += scan.nextInt();
            
            System.out.println("Overtime Hours for " + days_of_week.get(i) + ": ");
            total_overtime_hours += scan.nextInt();
        }
        
        //calculate
        overtime_pay = total_overtime_hours * 1.5 * hourly_wage;
        total_weekly_pay = hourly_wage * total_reg_hours + overtime_pay;
        
        //print out
        System.out.println("Total Weekly Pay: " + total_weekly_pay);
        
    }
}