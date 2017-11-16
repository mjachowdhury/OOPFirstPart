package questionTwo.controller;

 

import questionTwo.model.Book;
import questionTwo.model.BookList;
import questionTwo.model.Lecturer;
import questionTwo.model.LecturerList;
import questionTwo.model.ObjectList;
 

public class LecturerAndBookController{
	 
	private LecturerList lecturers;
	private BookList books;
	private int noOfBooks;
	
	//private LecturerList lecturers;
	private int noOfLecturer;
	private ObjectList obList;
	
	public LecturerAndBookController() {
		 books = new BookList(15);
		 lecturers = new LecturerList();
		 obList = new ObjectList();
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
		Lecturer l = new Lecturer(nameFromView, idFromView);
		//this.lecturers.addLecturer(l);
		 this.obList.add(l);
	
		//noOfLecturer ++;
	}
	
	/*
	 * this method will add books
	 */
	public void addBook(String titleFromView, int ISBNfromView, String authorFromView, double priceFromView){
		Book books = new Book(titleFromView, ISBNfromView, authorFromView, priceFromView);
		this.lecturers.addBookToLecturerList(books);
		noOfBooks++;
	}
	
	public void removeBookFromSystem(int iSBNFromView){
		this.books.removeBook(iSBNFromView);
	}
	
	public void searchBookFromSystem(int iSBNFromView){
		this.books.search(iSBNFromView);
	}
	public void findLecturer(int idFromView){
		/*Lecturer l = new Lecturer(idFromView);
		if(l.getID() == idFromView){
			System.out.println("Lecturer :" + l.getName() +"And"+ l.getID());
		}
		else{
			System.out.println("Did not find");
		}*/
		this.lecturers.getLecturerByID(idFromView);
	}
	
	public void calculateTotalBookPrice(){
		this.books.calculateYearlyBookPayment();
	}
}