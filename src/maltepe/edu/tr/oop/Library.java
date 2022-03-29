package maltepe.edu.tr.oop;

import java.util.Vector;

public class Library {

    Vector books ;
    public Library () {
        books = new Vector();
    }



    public void addbook(Book b) {
        books.add(b);
    }
    public void Borrow(String name,String bookName)
    {
        System.out.println(name+" borrowed ("+bookName+")");
    }
    public void Return(String name,String bookName)
    {
        System.out.println(name+" return ("+bookName+")");
    }
    public void BookList()
    {
        for(int i=0;i<books.size();i++)
        {
            Book temp=(Book) books.get(i);
            System.out.println((i+1)+"-"+temp.getBookName());
        }
    }

}
