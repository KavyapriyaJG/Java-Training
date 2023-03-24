package flyweight;
//Scenario : In a large collection of objects, majority of their states are the same
//Optimization : Grouping and storing the intrinsic states in a map as a flyweight. In concrete objects, only reference to intrinsic, saving space
public class UI {

    public static void main(String[] args) {

        BookStore store = new BookStore();
        
        store.storeBook("12039S", "Book1", 290.00f, "Action", "Sirius Publication House", "Timothee and Co.");
        store.storeBook("12309D", "Book2", 3500.00f, "Fantasy", "Dream Warrior Publication House", "Brothers Union"); 
        store.storeBook("52091F", "Book3", 799.00f, "Fantasy", "Dream Warrior Publication House", "Brothers Union");     
        store.storeBook("43039S", "Book4", 1000.00f, "Action", "Sirius Publication House", "Timothee and Co.");
        store.storeBook("98219E", "Book5", 760.00f, "Action", "Sirius Publication House", "Timothee and Co.");
        store.storeBook("62939G", "Book6", 850.00f, "Sci-fi", "Nolan Book House", "Red Gaint"); 

    	System.out.println("\n----------Available Books---------------\n");
        store.displayBooks();   

        BookFactory.displayAvailableGenre();
      
    }
}
