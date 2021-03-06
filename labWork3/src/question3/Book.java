package question3;

public class Book {

	private String title;
	private int ISBN;
	private String author;
	private double price;

	
	
	/**
	 * @param iSBN
	 * @param price
	 */
	public Book(int iSBN, double price) {
		this.ISBN = iSBN;
		this.price = price;
	}

	/**
	 * @param title
	 * @param iSBN
	 * @param author
	 * @param price
	 */
	
	public Book(String title, int iSBN, String author, double price) {
		this.title = title;
		this.ISBN = iSBN;
		this.author = author;
		this.price = price;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the iSBN
	 */
	public int getISBN() {
		return ISBN;
	}

	/**
	 * @param iSBN
	 *            the iSBN to set
	 */
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}
