//Mia Escoto 
//6-6 
//patron class 
import java.util.ArrayList;
import java.util.Arrays;

public class Patron{
    private Book book1, book2, book3;
    private String name;
    public Patron(String nm){
        name = nm;
        book1 = null;
        book2 = null;
        book3 = null;
    }
    
    public boolean borrowBook(Book book){
        if (book1 == null) {
            book1 = book;
        return true;
    } else if (book2 == null) {
            book2 = book;
            return true;
        } else if (book3  == null) {
            book3 = book;
            return true;
    }
        return false;
    }  
    
    public boolean checkBorrowed(Book book){
        if (book1 != null && book1.get_title().equals(book.get_title())) {
            return true;
        } else if (book2 != null && book2.get_title().equals(book.get_title())) {
            return true;
        } else if (book3 != null && book3.get_title().equals(book.get_title())) {
            return true;
        }
        return false;
    }
    
    public boolean returnBook(Book book){
        if (book1.get_title().equals(book.get_title())){
            book1 = null;
            return true;
        }  else if (book2.get_title().equals(book.get_title())) {
            book2 = null;
            return true;
        }else if (book3.get_title().equals(book.get_title())){
            book3 = null;
            return true;
        }
        return false;
    }
    
    public String toString(){
        String s1 = "Name: " + name;
        if(book1 != null){
            s1 += "\n"+ book1;
        }
        if (book2 != null) {
            s1 += "\n" + book2;
        }
        if (book3 != null) {
            s1 += "\n" + book3;
        } 
        return s1;
    }
    
}