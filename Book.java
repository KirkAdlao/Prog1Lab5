public class Book {

    //Variables
    private String title;
    private String publisher = "Vanier";
    private String author;
    private int isbn;
    private int year;   
    private int amountOfBook; 

    //constructor
    public Book() {
        author = "No author";
        isbn = 0;
        year = 0;
        amountOfBook = 0;
    }
    public Book(String title, String author, int isbn, int year, int amountOfBook){
        this.author = author; 
        this.title = title;
        this.isbn = isbn;
        this.year = year;
        this.amountOfBook = amountOfBook;
    }
    
    //getters        
    public String getTitle() {return title;}

    public String getAuthor() {return author;}

    public int getIsbn() {return isbn;}

    public int getYear() {return year;}

    public int getAmountOfBook() {return amountOfBook;}


    //setters
    public void setTitle(String title) {this.title = title;}

    public void setAuthor(String author) {this.author = author;}

    public void setIsbn(int isbn) {this.isbn = isbn;}

    public void setYear(int year) {this.year = year;}

    public void setAmountOfBook(int amountOfBook) {
        this.amountOfBook = amountOfBook;}


    public String toString()
    {
        return "Title: " + title + "\n" + "Publisher: " + publisher + "\n" + "Author: " + author + "\n" + 
        "ISBN: " + isbn + "\n" + "Year: " + year + "\n\n";
    }    
}