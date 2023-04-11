//Mia Escoto
//Ch 10 program 3 
//Getting the mode of each list

import java.util.Scanner;
import java.util.Arrays;

public class Mode{
    public static void main(String args[]){
        int numList[] = new int[10];
        Scanner scan = new Scanner(System.in);
        
        for(int i =0; i<10; i++){
            System.out.println("Enter any number");
            int n = scan.nextInt();
            numList[i] = n;
        }
        
        int mode = getMode(numList);
        int median = getMedian(numList);
        
        System.out.println("The mode of the list is: " + mode + "\nThe median of the list is: " + median);
        }
    public static int getMode(int list[]){
        int mode = 0;
        int highest = 0;
        
        for(int i=0; i<list.length; i++){
            int num = list[i];
            int count =0;
            for(int j=0; j<list.length; j++){
                if(list[j] == num)
                    count ++;
            }
            if(count > mode){
                mode = count;
                highest = num;
            }
        }
         return highest;
         
    }
    public static int getMedian(int list[]){
        Arrays.sort(list);
        //even length - avg of two middles
        return (list[4] + list[5]) / 2;
    }
}
