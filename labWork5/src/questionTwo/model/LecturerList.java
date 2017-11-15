package questionTwo.model;

import java.util.ArrayList;
import java.util.Iterator;

 

public class LecturerList extends ObjectList {
	private BookList books;
	private Lecturer lecturer;

	/**
	 * @param max
	 * @param lecturer
	 */
	public LecturerList( ) {
				 
	}
	
	
	/*
	 * this method will add lecturer
	 */
	public void addLecture(Lecturer l) {
		this.add(l);
	}

	/*
	 * this method will add book inside the lectureList
	 */
	
	/*public void addBook(Book b) {
		this.books.add(b);
	}*/

	/*
	 * this method will find lecturer by his/her id
	 */
	public int getLecturerByID(Lecturer id) {
		ArrayList<Object> objs = getList();
		int returnLecturer = -1;
		for (Object o : objs) {
			Lecturer checkLecturer = (Lecturer) o;
			if (checkLecturer.equals(o)) {
				returnLecturer = getList().indexOf(checkLecturer);
			}
		}
		return returnLecturer;
	}
	
	/*public void removeBook(Book b){
		this.books.remove(b);	
	}*/
	
	/*public Lecturer displayAllLecturer() {
		ArrayList<Object> oList = getList();
		Lecturer returnLecturer = null;
	
		for (Object l : oList) {
			Lecturer checkedLecturer = (Lecturer) l;
			returnLecturer = checkedLecturer;
		}
		return returnLecturer;
	 
}*/
	
	public void displayAllLecturer(){
		System.out.println("Trigger"); 
		for(Object o : this.getList()){
			 
			 Lecturer l = (Lecturer) o;
			 l.printLecturerDetails();
			 
		 }
		  
	}


	/**
	 * @return the books
	 */
	public BookList getBooks() {
		return books;
	}


	/**
	 * @return the lecturer
	 */
	public Lecturer getLecturer() {
		return lecturer;
	}


	/**
	 * @param books the books to set
	 */
	public void setBooks(BookList books) {
		this.books = books;
	}


	/**
	 * @param lecturer the lecturer to set
	 */
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
	
	

	 
}
