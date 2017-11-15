package questionTwo.model;

import questionOne.BookList;

public class Lecturer {

	private String name;
	private int ID;
	private BookList books;
	public static int MAX_NO_OF_BOOKS =15;
	
	
	public Lecturer(String name, int ID) {
		//super(ID);
		this.name = name;
		this.ID = ID;
		this.books = new BookList(MAX_NO_OF_BOOKS);		 
	}

	
	public Lecturer(int id){
		this.ID = id;
	}
	
	public void addBook(Book b){
		this.books.add(b);
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


	/**
	 * @return the mAX_NO_OF_BOOKS
	 */
	public static int getMAX_NO_OF_BOOKS() {
		return MAX_NO_OF_BOOKS;
	}


	/**
	 * @param mAX_NO_OF_BOOKS the mAX_NO_OF_BOOKS to set
	 */
	public static void setMAX_NO_OF_BOOKS(int mAX_NO_OF_BOOKS) {
		MAX_NO_OF_BOOKS = mAX_NO_OF_BOOKS;
	}

	 
	public String toString() {
		return "Lecturer [name=" + name + ", ID=" + ID + "]";
	}
	
	public void printLecturerDetails(){
		System.out.println(toString());
	}
	 
	
}
