/**
 * Author: Mia Esscoto 
 * Car class assignment
 */
public class Car{
    String make;
    String model;
    int year;
    
    public Car(String mk, String md, int yr){
        make = mk; 
        model = md;
        year = yr;
    }
    
    //Mutators 
    public void setMake(String mk){
        make = mk;
    }
    public void setModel(String md){
        model = md;
    }
    public void setYear(int yr){
        year = yr;
    }
    
    //Accessors 
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int setYear(){
        return year;
    }
    
    //tostring 
    
    public String toString(){
        String str1 = "\nMake: " + make + "\nModel: " + model + "\nYear: " + year;
        return str1;
    }
}