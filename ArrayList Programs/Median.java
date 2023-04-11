//Mia Escoto
//Ch 10 program 4 
//Getting Median of a list

import java.util.Scanner;
import java.util.Arrays;

public class Median{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How long is your list?");
        int x = scan.nextInt();
        int numList[] = new int[x];
        
        for(int i =0; i<x; i++){
            System.out.println("Enter any number");
            int n = scan.nextInt();
            numList[i] = n;
        }
        
        
        int median = getMedian(numList);
        System.out.println("Median: " + median);
        
        }
    public static int getMedian(int list[]){
        Arrays.sort(list);
        if (list.length %2 != 0)
            return list[list.length/2];
        return  (list[list.length/2] + list[list.length/2 - 1])/2;
    }
    }

