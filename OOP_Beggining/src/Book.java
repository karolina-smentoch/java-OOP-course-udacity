public class Book{
    // Fields
    private String title;
    private String author;
    private boolean isBorrowed;
    // Constructor
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    // Public methods - setters:
    public void borrowBook(){
        isBorrowed = true;
    }
    public void returnedBook(){
        isBorrowed = false;
    }
    // Public method - getter:
    public boolean isBookBorrowed(){
        return isBorrowed;
    }
}