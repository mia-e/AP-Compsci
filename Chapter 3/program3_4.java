//Mia Escoto
//displays employee's total weekly pay 
//3_4

import java.util.Scanner;

public class program3_4{
    public static void main(String args[]){
        //instantiate object
        Scanner scan = new Scanner(System.in);
        
        //declare variables 
        double hourly_wage;
        int reg_hours;
        int overtime_hours;
        double total_weekly_pay;
        double overtime_pay;
        
        //get user input 
        System.out.println("Hourly Wage: ");
        hourly_wage = scan.nextDouble();
        
        System.out.println("Total Regular Hours: ");
        reg_hours = scan.nextInt();
        
        System.out.println("Total Overtime Hours: ");
        overtime_hours = scan.nextInt();
        
        //calculations 
        overtime_pay = overtime_hours * 1.5 * hourly_wage;
        total_weekly_pay = hourly_wage * reg_hours + overtime_pay;
        
        //print out
        System.out.println("Total Weekly Pay: " + total_weekly_pay);
        
    }
}