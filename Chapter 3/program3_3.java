//Mia Escoto 
//calculates kinetic energy of a moving object 
//3_3

import java.util.Scanner;

public class program3_3{
    public static void main(String args[]){
        //instantiate object
        Scanner scan = new Scanner(System.in);
        
        //declare variables
        double velocity; 
        double mass; 
        double kineticEnergy;
        
        //get object mass
        System.out.println("Mass: ");
        mass = scan.nextDouble();
        
        //get object velocity 
        System.out.println("velocity: ");
        velocity = scan.nextDouble();
        
        kineticEnergy = .5 * ( mass *(velocity * velocity));
        System.out.println("Kinetic Energy: " + kineticEnergy);
        
    }
}
