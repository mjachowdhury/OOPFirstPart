package questionTwo.model;

import questionOne.Book;
import questionOne.BookList;

public class Lecturer extends ObjectList {

	private String name;
	private int ID;
	private BookList books;
	public static int MAX_NO_OF_BOOKS = 15;

	public Lecturer(String name, int ID) {
		//super(ID);
		this.name = name;
		this.ID = ID;
		this.books = new BookList(MAX_NO_OF_BOOKS);
	}

	
	 


	public Lecturer(int id) {
		this.ID = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @return the books
	 */
	public BookList getBookList() {
		return books;
	}

	/*public void addBook(Book b) {
		books.add(b);
	}*/

	public String toString() {
		return "Lecturer Name :" + name + "\nID :" + ID + "\nBooks :" + books + ".";
	}

	public void print() {
		System.out.println(toString());
	}

}