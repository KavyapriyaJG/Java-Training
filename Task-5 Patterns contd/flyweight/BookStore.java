package flyweight;

import java.util.List;
import java.util.ArrayList;

public class BookStore {

    private final List<Book> books = new ArrayList<>();

    public void storeBook(String isbn, String title, float price, String genre, String publicationHouse, String distributor) {
        BookGenre bookType = BookFactory.getBookType(genre, publicationHouse, distributor);
        books.add(new Book(isbn, title, price, bookType));
    }

    public void displayBooks() {
        for(Book book: books) {
        	System.out.println(book);
        }
    }

    
}
