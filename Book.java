//initiating the public class book
public class Book {

    //defining the title and author strings as public so that it can be used throughout the project
    private String title;
    private String author;

    //modifying the constructor method of this class to make this code simpler
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    //setting the getters for the title and author in the book class 
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }

    //Adding the toString method to be referenced later
    public String toString(){
        return String.format("%s by %s",this.title,this.author);
        
    }

}
