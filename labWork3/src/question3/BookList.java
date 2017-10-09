package question3;

import java.util.ArrayList;

public class BookList {

	private static final int MAX_NO_OF_BOOKS = 15;
	
	private ArrayList<Book> books;
	
	public BookList(){
		this.books = new ArrayList<Book>();
	}
	
	public void addBook(Book b){
		books.add(b);
	}
}
