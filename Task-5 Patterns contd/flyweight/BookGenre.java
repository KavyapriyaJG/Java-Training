package flyweight;

public class BookGenre {
	private String genre;
	private String publicationHouse;
	private String distributor;
	
	public BookGenre(String genre, String publicationHouse, String distributor) {
		this.genre = genre;
		this.publicationHouse = publicationHouse;
		this.distributor = distributor;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPublicationHouse() {
		return publicationHouse;
	}
	public void setPublicationHouse(String publicationHouse) {
		this.publicationHouse = publicationHouse;
	}
	
	public String getDistributor() {
		return distributor;
	}
	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}
	@Override
	public String toString() {
		return "BookGenre [ genre="+genre+" ,publicationHouse=" + publicationHouse + ", distributor=" + distributor+ "]";
	}
	
	
}
