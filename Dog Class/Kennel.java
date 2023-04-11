//Mia Escoto 
//runner class for Dog class 

public class Kennel{
    public static void main(String args[]){
        Dog dog1 = new Dog("fluffy", 5);
        Dog dog2 = new Dog();
        
        dog2.setName("Bella");
        dog2.setAge(9);
        
        System.out.println(dog1);
        System.out.println(dog2);
    }
}