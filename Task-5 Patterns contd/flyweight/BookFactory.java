package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {

    private static final Map<String, BookGenre> bookTypes = new HashMap<>();

    public static BookGenre getBookType(String genre, String publicationHouse, String distributor) {
        if (bookTypes.get(genre) == null) {
            bookTypes.put(genre, new BookGenre(genre, publicationHouse,distributor));
        }
        //System.out.println(bookTypes);
        return bookTypes.get(genre);
    }
    
    public static void displayAvailableGenre() {
    	System.out.println("\n----------Available Genre---------------");
    	for(Map.Entry<String,BookGenre> book : bookTypes.entrySet()) {
    		System.out.println("\nGenre - "+book.getKey());
    		System.out.println(book.getValue());
    	}
    	System.out.println("\n----------------------------------------");
    }

}