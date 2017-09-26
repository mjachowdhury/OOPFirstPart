package question3.view;

import java.util.Scanner;

import question3.controller.StudentController;
import question3.model.StudentService;

public class StudentView {
	private static final int ADD_A_STUDENT = 1;
	private static final int REMOVE_A_STUDENT = 2;
	private static final int DISPLAY_ALL_STUDENT = 3;
	private static final int EXIT = 4;
	private Scanner keyboard;

	private int menuChoice = 0;
	private StudentController theStudentController;

	public StudentView() {
		this.theStudentController = new StudentController();

	}

	public void startUserInterface() {

		printMenu();
		menuChoice = keyboard.nextInt();

		while (menuChoice != EXIT) {

			switch (menuChoice) {

			case ADD_A_STUDENT: {
				String firstName;
				String lastName;
				double mark = 0;

				System.out.println("Please enter first name :");
				firstName = keyboard.next();
				System.out.println("Please enter last name :");
				lastName = keyboard.next();
				System.out.println("Please enter mark :");
				mark = keyboard.nextDouble();

				this.theStudentController.addStudent(firstName, lastName, mark);
				break;
			}
			/*
			 * case REMOVE_A_STUDENT :{ break; } case DISPLAY_ALL_STUDENT :{
			 * break; }
			 */
			}
		}

	}

	public void printMenu() {

		System.out.println();
		System.out.println("1. Add a Student in the System :");
		System.out.println("2. Remove a Student from the System :");
		System.out.println("3. Display all Student from the System :");
		System.out.println("4. Exit");
	}

}
