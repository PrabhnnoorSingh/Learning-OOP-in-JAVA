public class EBook extends Book {
    //making the format as private for security
    private String format;
    //modifying the constructor for the EBook class
    EBook(String title, String author,int pageCount, String format){
        // using the super command to reference the book class
        super(title, author, pageCount);
        //using this. command to only affect the elements in this class
        this.format = format;
    }
}
