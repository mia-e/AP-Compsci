// Mia Escoto
// Dice Class 
import java.util.Random;

public class Dice{
    private int money; 
    private int roll1;
    private int roll2;
    
    
    public Dice(int mn){
        money = mn;
        roll1 = 0;
        roll2 = 0;
    }
    public int rollDice(){
        Random rand = new Random();
        roll1 = rand.nextInt(6) + 1;
        roll2 = rand.nextInt(6) + 1;
        int result = roll1 + roll2;
        if (result ==7){
            money += 4;
        }
        else{
            money -=1;
        }
        
        return money;
        }
}