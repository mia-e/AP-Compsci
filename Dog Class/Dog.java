/** 
 * Dog Class
 * Holds the information of a Dog 
 * Version 9/21/22
 */ 

public class Dog{
    //Instance Variables 
    private String name; 
    private int age;
    
    //constructor 
    public Dog(){
        name = "";
        age = 0;
    }
    public Dog(String nm, int a){
        name = nm; 
        age = a; 
    }
    
    //accessors 
    public String getName(){
        return name; 
    }
    public  int getAge(){
        return age; 
    }
    
    //mutators 
    public void setName(String n){
        name = n;
    }
    public void setAge(int a ){
        age = a;
    }
    public int personYears(){
        return age*7;
    }
    
    //to string 
    public String toString(){
        return "Name: " +  name + "\nAge: " + age + "\nPerson Years : " + personYears() + "\n" ;
    }
}
