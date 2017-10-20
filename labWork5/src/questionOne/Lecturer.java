package questionOne;

public class Lecturer extends BookList{

	private String name;
	private int ID;
	private BookList books;
	public static int MAX_NO_OF_BOOKS =15;
	
	
	public Lecturer(String name, int ID) {
		super(ID);
		this.name = name;
		this.ID = ID;
		this.books = new BookList(MAX_NO_OF_BOOKS);		 
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the books
	 */
	public BookList getBooks() {
		return books;
	}

	/**
	 * @param books the books to set
	 */
	public void setBooks(BookList books) {
		this.books = books;
	}
	
	public void addBook(Book b){
		books.add(b);
	}

	 
	public String toString() {
		return "Lecturer Name :" + name + "\nID :" + ID + "\nBooks :" + books + ".";
	}
	
	public void print(){
		System.out.println(toString());
	}

}
