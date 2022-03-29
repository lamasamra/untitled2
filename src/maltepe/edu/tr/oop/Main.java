package maltepe.edu.tr.oop;

public class Main {

    public static void main(String[] args) {

        Professor obj1 = new Professor("ensar",19064634);
        Student obj2 = new Student("lama",192222);

        Book book1=new Book("physic");
        Book book2=new Book("math");
        Book book3=new Book("java");
        Library library=new Library();

        library.addbook(book1);
        library.addbook(book2);
        library.addbook(book3);

        obj1.work();

        System.out.println(obj2.getName());
        System.out.println(obj2.getstu_ID());
        System.out.println(obj1.getpro_ID());

        obj1.ReadBook(obj1.getName1(),book1);
        library.BookList();
    }
}