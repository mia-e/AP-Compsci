// Mia Escoto 
// Dice Runner Class 

import java.util.Scanner;

public class DiceRunner{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int userMoney;
        int rollCount = 0;
        int maxAmt;
        
        System.out.println("Enter the amount of money you're prepared to lose");
        userMoney = scan.nextInt();
        maxAmt = userMoney;
        
        Dice d1 = new Dice(userMoney);
        while(userMoney !=0){
            rollCount ++;
            userMoney = d1.rollDice();
            if(userMoney > maxAmt){
                maxAmt = userMoney;
            }
        }
        System.out.println("It took " + rollCount + " rolls in order "+
        "to depleate funds. The max amount of funds had was $" + maxAmt);
        
        
        
    }
}