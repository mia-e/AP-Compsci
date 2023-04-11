//Mia Escoto 
//creates a date class 

public class Date{
    private int day, month, year;
    
    //constructors 
    public Date(){
       day = 0;
       month = 0;
       year = 0;
    }
    public Date(int dy, int mth, int yr){
        day = dy;
        month = mth;
        year = yr;
    }
    
    //accessors 
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public boolean compare(int dy, int mth, int yr){
        if((day == dy && month == mth) && year == yr)
            return true;
        else
            return false;
    }
    
    //mutators
    public void setDay(int dy){
        day = dy;
    }
    public void setMonth(int mth){
        month = mth;
    }
    public void setYear(int yr){
        year = yr;
    }
    
    public String toString(){
        return "\nDay: "+ day + "\nMonth: " + month + "\nYear: " +year ;
    }
    
}