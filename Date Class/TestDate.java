//Mia Escoto
//runner class for date 

public class TestDate{
    public static void main(String args[]){
        Date D1 = new Date(13, 2, 1996);
        Date D2 = new Date();
        D2.setMonth(2);
        D2.setDay(13);
        D2.setYear(2007);
        System.out.println(D1 + "\n" + D2);
        boolean datesEqual = D2.compare(D1.getDay(), D1.getMonth(), D1.getYear());
        if (datesEqual == true)
            System.out.println("\nDates are the same");
        else
            System.out.println("\nDates are not the same");
 
        
        
    }
}