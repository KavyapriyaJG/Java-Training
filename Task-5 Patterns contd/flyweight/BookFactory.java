package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Maps the fly weight component to the intrinsic state of the object.
 * @author Kavyapriya
 */
public class BookFactory {

    private static final Map<String, BookGenre> bookTypes = new HashMap<>();

    /**
     * To map fly weight component to the intrinsic state of the object.
     * @param genre
     * @param publicationHouse
     * @param distributor
     * @return the extrinsic state
     */
    public static BookGenre getBookType(String genre, String publicationHouse, String distributor) {
        if (bookTypes.get(genre) == null) {
            bookTypes.put(genre, new BookGenre(genre, publicationHouse,distributor));
        }
        //System.out.println(bookTypes);
        return bookTypes.get(genre);
    }
    
    /**
     * Displays the available genre
     */
    public static void displayAvailableGenre() {
    	System.out.println("\n----------Available Genre---------------");
    	for(Map.Entry<String,BookGenre> book : bookTypes.entrySet()) {
    		System.out.println("\nGenre - "+book.getKey());
    		System.out.println(book.getValue());
    	}
    	System.out.println("\n----------------------------------------");
    }

}