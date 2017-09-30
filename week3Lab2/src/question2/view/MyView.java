package question2.view;

import java.util.Scanner;
import question2.controller.MyController;
import question2.model.Actor;
import question2.model.Film;

public class MyView {
	// Final static variables
	private static final int ADD_A_ACTOR_DETAILS = 1;
	private static final int ADD_A_FILM_DETAILS = 2;
	private static final int DISPLAY_ALL_ACTOR_DETAILS = 3;
	private static final int DISPLAY_ALL_FILM_DETAILS = 4;
	private static final int EXIT = 5;

	private int menuChoice;
	private MyController theController;
	private Scanner keyboard;

	// This is the default constructor. I have added some of our own code in
	// here to create an instance of the controller which this view class will use.
	public MyView() {
		this.theController = new MyController();
	}

	public void startUserInterface() {
		keyboard = new Scanner(System.in);
		displayMenu();
		menuChoice = keyboard.nextInt();

		// Keep looping while the user has not chosen to exit.
		while (menuChoice != EXIT) {
			switch (menuChoice) {
			case ADD_A_ACTOR_DETAILS: {
				String actorName;
				String actorAddress;
				int actorAge;

				System.out.println("Please enter actor's name :");
				actorName = keyboard.next();
				System.out.println("Please enter actor's address :");
				actorAddress = keyboard.next();
				System.out.println("Please enter actor's age :");
				actorAge = keyboard.nextInt();

				// The user interface has gathered the name,address and age. We
				// now send them to the controller for "processing".
				theController.addActor(actorName, actorAddress, actorAge);
				break;
			}
			case ADD_A_FILM_DETAILS: {
				String filmName;
				String code;

				System.out.println("Please enter film name :");
				filmName = keyboard.next();
				System.out.println("Please enter film code :");
				code = keyboard.next();

				// The user interface has gathered the name and code. We now
				// send them to the controller for "processing".
				theController.addActorFilmDetails(filmName, code);
				break;
			}
			case DISPLAY_ALL_ACTOR_DETAILS: {
				// Do whatever needs to be done to lookup a actor
				// If the user wants to display all actor we ask the controller
				// to give us all the actor which it has stored in its array of theActor.
				Actor[] theActor = theController.displayAllActor();
				int numberOfActorInArray = theController.getNumberOfActorInArray();

				for (int i = 0; i < numberOfActorInArray; i++) {
					Actor currentActor = theActor[i];
					currentActor.print();
				}
				break;
			}
			case DISPLAY_ALL_FILM_DETAILS: {
				// Do whatever needs to be done to lookup a film
				// If the user wants to display all film we ask the controller
				// to give us
				// all the film which it has stored in its array of theFilm.
				Film[] theFilm = theController.displayAllFilm();
				int numberOfFilmInArray = theController.getNumberOfFilmInArray();

				for (int i = 0; i < numberOfFilmInArray; i++) {
					Film currentFilm = theFilm[i];
					currentFilm.print();
				}
				break;
			}
			}
			displayMenu();
			menuChoice = keyboard.nextInt();

		}
		System.out.println("GoodBye!");
	}

	public void displayMenu() {
		System.out.println();
		System.out.println("1.Add Actor Details.");
		System.out.println("2.Add Film Details");
		System.out.println("3.Display Actor Details.");
		System.out.println("4.Display Film Details.");
		System.out.println("5.Exit.");
	}
}
