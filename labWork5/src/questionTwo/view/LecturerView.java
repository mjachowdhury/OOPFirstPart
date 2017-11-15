package questionTwo.view;

import java.util.Scanner;

import questionTwo.UserMenu;
import questionTwo.controller.LecturerAndBookController;

public class LecturerView {
	
	public static final int ADD_LECTURER = 1;
	public static final int FIND_LECTURER = 2;
	public static final int ADD_BOOK = 3;
	public static final int REMOVE_BOOK = 4;
	public static final int SEARCH_BOOK = 5;
	public static final int CALCULATE_YEARLY_BOOK_PAYMENT = 6;
	public static final int SHOW_ALL_THE_BOOK = 7;
	private static final int DISPLAY_ALL_LECTURER =8;
	public static final int EXIT = 9;

	private LecturerAndBookController lb;
	UserMenu userMenu = new UserMenu();

	public LecturerView() {
		lb= new LecturerAndBookController();

	}

	Scanner keyboard = new Scanner(System.in);
	int userChoice;

	public void userMenu() {
		System.out.println("Welcome to the Programm.");
		userMenu.menu();

		System.out.println("Please choose one of the following options.");
		userChoice = keyboard.nextInt();
		while (userChoice != EXIT) {
			switch (userChoice) {
			case ADD_LECTURER: {
				System.out.println("You choose to add the Lecturer in the system.");
				
				String name;
				int id;
				
				System.out.println("PLEASE ENTER THE NAME: ");
				name = keyboard.next();
				
				System.out.println("PLEASE ENTER THE ID : ");
				id = keyboard.nextInt();
				
				this.lb.addLecturer(name, id);
				
				
				System.out.println("LECTURER ADDED SUCCESSFULLY IN THE SYSTEM.");
				
				break;
			}
			case FIND_LECTURER: {
				System.out.println("YOU HAVE CHOOSE TO FIND LECTURERS :");
				System.out.println("PLEASE ENTER THE ID NUMBER:");
				int id = keyboard.nextInt();
				this.lb.findLecturer(id);
				
			 
				
				break;
			}
			case ADD_BOOK: {
				System.out.println("We have choose to add book.");
				
				  String title;
				  int ISBN;
				  String author;
				  double price;
				  
				  System.out.println("PLEASE ENTER THE TITLE OF THE BOOK: ");
				  title = keyboard.next();
				  
				  System.out.println("PLEASE ENTER THE ISBN NUMBER: ");
				  ISBN = keyboard.nextInt();
				  
				  System.out.println("PLEASE ENTER THE BOOK AUTHOR NAME :");
				  author = keyboard.next();
				  
				  System.out.println("PLEASE ENTER THE BOOK PRICE :");
				  price = keyboard.nextDouble();
				  
				  this.lb.addBook(title, ISBN, author, price);
				  
				  System.out.println("BOOK ADDED SUCCESSFULLY IN THE SYSTEM.");
				break;
			}
			case REMOVE_BOOK: {
				break;
			}
			case SEARCH_BOOK: {
				break;
			}
			case CALCULATE_YEARLY_BOOK_PAYMENT: {
				break;
			}
			case SHOW_ALL_THE_BOOK: {
				break;
			}
			case DISPLAY_ALL_LECTURER: {
				System.out.println("YOU CHOOSE TO SEE ALL THE LECTURERS.");
			//	this.lb.displayAllLecturer();
				break;
			}

			default:
				break;
			}
			userMenu.menu();
			userChoice = keyboard.nextInt();
			//System.out.println("Good bye");
			
		}

	}

}
