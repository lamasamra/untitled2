package maltepe.edu.tr.oop;

public class Book{
    private String BookName;

    public Book(String bookName)
    {
        this.BookName=bookName;
    }

    public void setBookName(String bookName)
    {
        this.BookName=bookName;
    }

    public String getBookName()
    {
        return BookName;
    }
}