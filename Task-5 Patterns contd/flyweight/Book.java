package flyweight;

public class Book {
	public String ISBN;
	public String title;
	public float price;
	public BookGenre bookGenre;

	
	public Book(String ISBN, String title, float price, BookGenre bookGenre) {
		this.ISBN = ISBN;
		this.title = title;
		this.price = price;
		this.bookGenre = bookGenre;
	}


	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", price=" + price + ", bookGenre=" + bookGenre + "]";
	}

	
}
