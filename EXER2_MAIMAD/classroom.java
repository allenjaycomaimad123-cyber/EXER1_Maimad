import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void showAllBooks(){
        for (Book b : books){
            b.displayInfo();
        }
    }
}
