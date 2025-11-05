//initiating the public class book
public class Book {

    //defining the title and author strings as public so that it can be used throughout the project
    public String title;
    public String author;

    //Adding the toString method to be referenced later
    public String toString(){
        return String.format("%s by %s",this.title,this.author);
        
    }

}
