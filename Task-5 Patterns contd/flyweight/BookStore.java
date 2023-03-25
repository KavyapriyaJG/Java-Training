package flyweight;

import java.util.List;
import java.util.ArrayList;

/**
 * Stores the books
 * @author Kavyapriya
 *
 */
public class BookStore {

    private final List<Book> books = new ArrayList<>();

    /**
     * Gets details of the book and adds it to existing list of books.
     * @param isbn
     * @param title
     * @param price
     * @param genre
     * @param publicationHouse
     * @param distributor
     */
    public void storeBook(String isbn, String title, float price, String genre, String publicationHouse, String distributor) {
    	
        BookGenre bookType = BookFactory.getBookType(genre, publicationHouse, distributor);
        books.add(new Book(isbn, title, price, bookType));
    }

    /**
     * Displays available set of books
     */
    public void displayBooks() {
        for(Book book: books) {
        	System.out.println(book);
        }
    }

    
}
