package models;

public class Books {
    String BookName;
    String Author;
    int ISBN;
    int publicationYear;

    public Books(String bookName, String author, int ISBN, int publicationYear) {
        BookName = bookName;
        Author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return BookName;
    }

    public String getAuthor() {
        return Author;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public void print_books(){

        System.out.println("Name: "+ this.BookName);
        System.out.println("Author: "+ this.Author);
        System.out.println("ISBN :"+this.ISBN);
        System.out.println("Published Year :"+this.publicationYear);
    }

}
