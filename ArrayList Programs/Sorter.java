//Mia Escoto 
//Ch 10 problems 
//Lists the negative, odd & even values in list

import java.util.Scanner;

public class Sorter{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int evenList[] = new int[10];
        int oddList[] = new int[10];
        int negativeList[] = new int[10];
        int even_ct =0;  
        int odd_ct =0;  
        int neg_ct =0; 
    
        for(int i =0; i<10; i++){
            System.out.println("Enter any integer");
            int n = scan.nextInt();
            if(n < 0){
                negativeList[neg_ct] = n;
                neg_ct ++;
            }
            else if(n % 2 == 0){
                evenList[even_ct] = n;
                even_ct ++;
            }
            else {   
                oddList[odd_ct] = n;
                odd_ct++;
            }
        }
        
        System.out.println("\nOdd Numbers:");
        for(int i=0; i<odd_ct; i++)
            System.out.print(oddList[i] + ", ");
                
        System.out.println("\nEven Numbers:");
        for(int i=0; i<even_ct; i++)
            if(evenList[i] !=0)
                System.out.print(evenList[i] + ", ");
                
        System.out.println("\nNegative Numbers:");
        for(int i=0; i<neg_ct; i++)
            if(negativeList[i] !=0)
                System.out.print(negativeList[i] + ", ");
        
                
    }
    
}