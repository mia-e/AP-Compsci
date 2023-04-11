//Mia Escoto 
//runs car class 

public class CarTest{
    public static void main(String args[]){
        Car c1 = new Car("Nisan", "Altima", 2020);
        Car c2 = new Car("Toyota", "Prius", 2022);
        Car c3 = new Car("Mercedes", "Benz", 2021);
        
        System.out.println("\n" + c1 + "\n" + c2 + "\n" + c3);
        
        c1.setMake("Jeep");
        c2.setModel("Buick");
        c3.setYear(2022);
        
        System.out.println("\n" + c1 + "\n" + c2 + "\n" + c3);
        
    }
}