// Written by Alexandra Krasney on March 4th 2023

/**
 * Pseudocode
 * 
 * 1) Create book class 
 * 2) Assign to book class necessary properites 
 * 3) Create toString() method 
 * 4) Create equals() method 
 * 5) Create other class and main() method 
 */

class Book {
    // To create the default properties of the Book clas
    public String Title = " ";
    public String Publisher = " ";
    public String Author = " ";
    public String ISBN = " ";
    public int PublicationYear = 0;
    
    // To create the default constructor method. There is no code contained within the default constructor, as the properties of a freshly
    // created instance of the Book class (before any arguments it has are incorporated into its )
    
    public Book() {
    
    
    }
    
    // To create the conversion constructor method 
    public Book(String inputtedTitle, String inputtedPublisher, String inputtedAuthor, String inputtedISBN, int inputtedPublicationYear){
        this.Title = inputtedTitle;
        this.Publisher = inputtedPublisher;
        this.Author = inputtedAuthor;
        this.ISBN = inputtedISBN;
        this.PublicationYear = inputtedPublicationYear;
    }
    
    // To create the copy constructor method 
    public static Book copyBook(Book inputtedBook) {
        Book copiedBook = new Book();
        
        copiedBook.Title = inputtedBook.Title; 
        copiedBook.Publisher = inputtedBook.Publisher; 
        copiedBook.Author = inputtedBook.Author;
        copiedBook.ISBN = inputtedBook.ISBN;
        copiedBook.PublicationYear = inputtedBook.PublicationYear;
        
        return copiedBook;
    }
    
    // To create the equals method. This one was hard
    public boolean equals(Book bookToBeCompared){
        boolean isIdenticalTitle = this.Title.equals(bookToBeCompared.Title); 
        boolean isIdenticalPublisher = this.Publisher.equals(bookToBeCompared.Publisher);
        boolean isIdenticalAuthor = this.Author.equals(bookToBeCompared.Author);
        boolean isIdenticalISBN = this.ISBN.equals(bookToBeCompared.ISBN);
    
        boolean isIdentical = true;
        
        if (isIdenticalTitle == true && isIdenticalPublisher == true && isIdenticalAuthor == true && isIdenticalISBN == true &&
        this.PublicationYear == bookToBeCompared.PublicationYear) {
            isIdentical = true;
        }
        else {
            isIdentical = false;
        }
        return isIdentical;
        }
    
    // To create the toString method 
    public String toString() {
        String stringedBook = ("The properties of this book are:" + "\nTitle: " + this.Title + "\nPublisher: " + this.Publisher
        + "\nAuthor: " + this.Author + "\nISBN: " + this.ISBN + "\nYear of publication: " + this.PublicationYear);
        return stringedBook;
        }
    }
        




// To demonstrate the methods thus created s 
public class AssignmentNo10AKrasney {
    public static void main(String[] args) {
    
    // To demonstrate the 
    Book testBook1 = new Book("Something", "The Internet", "Your Mom", "000-000-000-0" , 2000);
    Book testBook2 = new Book("Something", "The Internet", "Your Mom", "000-000-000-0" , 2000);
    boolean testing = testBook1.equals(testBook2);   
        
    System.out.println(testing);
    
        
    }
    
}

