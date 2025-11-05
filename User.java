import java.time.LocalDate; //import the LocalDate class to use the LocalDate method for the birhtDate
import java.time.Period;  //import the Period class to select a specific timePeriod in the project
import java.util.ArrayList; //importing the ArrayList
// initializing the User class as public to be used throughout the project
public class User{
    
    //initializing the name method as public to be used anywhere in the project
    public String name;

    //initializing the birthDate method as public to be used anywhere in the project and using the LocalDate class for the date 
    public LocalDate birthDate; 

    public ArrayList<Book> books = new ArrayList<Book>();

    public void borrow(Book book){
        this.books.add(book);
    }
    //initializing the age method as public to be used anywhere in the project
    public int age(){                                                           //using the Period class to stay inide a specified period
        int age = Period.between(this.birthDate, LocalDate.now()).getYears();   //using the .between method to stay inside probided dates
        return age;                                                             //using the "this" keyword to tell the JVM to work on the current object
    }                                                                           //using the getYears method to return the value in years only
                                                                                
}