//Mia Escoto
//Letter Grade Calculator 

import java.util.Scanner;

public class gradeCalculator{
    public static void main(String args[]){
        String letterGrade = ""; 
        Scanner scan = new Scanner(System.in);
        int numberGrade;
        
        System.out.println("Enter the number grade");
        numberGrade = scan.nextInt();
        
        if(numberGrade >= 96)
            letterGrade = "A+";
        else if(numberGrade >=92)
            letterGrade = "A";
        else if(numberGrade >=90)
            letterGrade = "A-";
        else if(numberGrade >=86)
            letterGrade = "B+";
        else if(numberGrade >=82)
            letterGrade = "B";
        else if(numberGrade >=80)
            letterGrade = "B-";
        else if(numberGrade >=76)
            letterGrade = "C+";
        else if(numberGrade >=72)
            letterGrade = "C";
        else if(numberGrade >=70)
            letterGrade = "C-";
        else if(numberGrade >=66)
            letterGrade = "D+";
        else if(numberGrade >=62)
            letterGrade = "D";
        else if(numberGrade >=60)
            letterGrade = "D-";
        else if(numberGrade <= 59)
            letterGrade = "F";
            
        System.out.println("Letter Grade: " + letterGrade);
    }
}