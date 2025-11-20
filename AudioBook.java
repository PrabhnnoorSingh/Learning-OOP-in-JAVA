public class AudioBook extends Book {
    //making the runtime as private for security
    private int runTime;
    //modifying the constructor for the AudioBook class
    AudioBook(String title, String author, int runTime){
        // using the super command to reference the book class
        super(title, author, 0);
        //using this. command to only affect the elements in this class
        this.runTime = runTime;
    }
}
