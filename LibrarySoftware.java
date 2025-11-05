import java.time.LocalDate; //import the LocalDate class to use the LocalDate method for the birhtDate

//initializing the Digital library class 
class LibrarySoftware {
    public static void main(String[]args){
        
        //Assigning a new user in the user class 
        User youngerUser = new User("Prabhnoor Singh", "2005-05-08");

        //Assigning value to the youngerUser
        // youngerUser.name = "Prabhnoor Singh";
        // youngerUser.birthDate = LocalDate.parse("2005-08-05");

        //printing the information using the printf method
        System.out.printf("%s was born on %s, he is %d Years old now.", youngerUser.name, youngerUser.birthDate.toString(),  youngerUser.age());

        // assigning a new user to the user class
        User olderUser = new User("Narinder Singh","1979-03-04" );

        //Assigning value to the olserUser
        // olderUser.name = "Narinder Singh";
        // olderUser.birthDate = LocalDate.parse("1979-03-04");

        //assigning a new book to the book class
        Book book = new Book();

        // Assigning value to the book 
        book.title = "Carmilla";
        book.author = "Sheridan le fanu";

        youngerUser.borrow(book);

        //printing the info of the older user
        System.out.printf("%s was born on %s, he is %d Years old now./n", olderUser.name, olderUser.birthDate.toString(),  olderUser.age());

        System.out.printf("%s has borrowed the following book: %s",youngerUser.name, youngerUser.books.toString());
    }
}
 