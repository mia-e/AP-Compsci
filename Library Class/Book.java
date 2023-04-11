//Mia Escoto 
//6-6 project 
//Book Class

public class Book{
    String title;
    String author;
    
    public Book(String ti, String auth){
        title = ti;
        author = auth;
    }
    
    public String get_title(){
        return title;
    }
    
    public String get_author(){
        return author;
    }
    
    public String toString(){
        return "Title: "+ title + " Author: "+author;
    }
}