//initiating the public class book
public class Book {

    //defining the title and author strings as public so that it can be used throughout the project
    private String title;
    private String author;
    private int pageCount;

    //modifying the constructor method of this class to make this code simpler
    Book(String title, String author, int pageCount){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    //setting the getters for the title and author in the book class 
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int PageCount(){
        return this.pageCount;
    }

    //Adding the toString method to be referenced later
    public String toString(){
        return String.format("%s by %s",this.title,this.author);
        
    }

}
