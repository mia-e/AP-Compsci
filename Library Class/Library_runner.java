//Mia Escoto 
//Runner for Patron and Book 

public class Library_runner{
    public static void Main(String args[]){
        Book b1 = new Book("Looking For Alaska", "John Green");
        Book b2 = new Book("Emma", "Jane Austen");
        Book b3 = new Book("Gone Girl", "Gillian Flynn");
        Book b4 = new Book("A Room Of Ones Own", "Virginia Woolf");
        Patron p1 = new Patron("Sally");
        
        p1.borrowBook(b1);
        p1.borrowBook(b2);
        p1.borrowBook(b3);
        
        System.out.println(p1);
        
        boolean borrowed = p1.checkBorrowed(b3);
        if (borrowed = true){
            p1.returnBook(b3);
            p1.borrowBook(b4);
        }
        System.out.println(p1);
        
        
    }
}