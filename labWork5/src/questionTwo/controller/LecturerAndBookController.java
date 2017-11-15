package questionTwo.controller;

import java.util.Iterator;

import questionTwo.model.Book;
import questionTwo.model.BookList;
import questionTwo.model.Lecturer;
import questionTwo.model.LecturerList;

public class LecturerAndBookController{
	private BookList books;
	private int noOfBooks;
	
	private LecturerList lecturers;
	private int noOfLecturer;
	
	public LecturerAndBookController() {
		 books = new BookList();
		 lecturers = new LecturerList();
	}
	
	
	/**
	 * @return the noOfBooks
	 */
	public int getNoOfBooks() {
		return noOfBooks;
	}


	/**
	 * @return the noOfLecturer
	 */
	public int getNoOfLecturer() {
		return noOfLecturer;
	}

	/*
	 * this method will add lecturers
	 */
	public void addLecturer(String nameFromView, int idFromView){
		Lecturer lecturer = new Lecturer(nameFromView, idFromView);
		this.lecturers.addLecture(lecturer);
		noOfLecturer ++;
	}
	
	/*
	 * this method will add books
	 */
	public void addBook(String titleFromView, int ISBNfromView, String authorFromView, double priceFromView){
		Book books = new Book(titleFromView, ISBNfromView, authorFromView, priceFromView);
		this.books.addBook(books);
		noOfBooks++;
	}
	
	public void findLecturer(int idFromView){
			Lecturer lecturer = new Lecturer(idFromView);
		 this.lecturers.getLecturerByID(lecturer);
		 if(this.lecturers.getLecturer().equals(lecturer)){
			 System.out.println("lecturer found");
		 }
		 else{
			 System.out.println("not found");
		 }
		 
	}
	
}