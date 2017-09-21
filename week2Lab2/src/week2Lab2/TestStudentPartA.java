package week2Lab2;

import java.awt.SecondaryLoop;
import java.util.Scanner;

/*
 * Write a program called TestStudentPartA that will allow a 
 * teacher to input student details such as student first name, 
 * student second name and examination mark at the keyboard for
 * at least 20 students. Once all examination marks have been 
 * entered, the program must display the mark and grade for 
 * each of the students as follows:

	“William Buckley received a Merit for his mark of 68”. 
	And so on for the rest of the students
 */

/*
 * The grades are given by the following table:
      Mark range     grade
      85 – 100           distinction	(2)
      65 – 84             merit
      40 – 64             pass
      0  - 39               fail

 */
public class TestStudentPartA {

	public static void main(String[] args) {

		String firstName;
		String lastName;
		double mark;
		String grade;
		
		int [] student = new int[5];
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the Student details.");
		System.out.println("==========================");
		
		for(int i = 0; i < student.length; i++){
			System.out.println("Enter Studnet First Name :");
			firstName = keyboard.next();
			System.out.println("Enter Studnet Last Name :");
			lastName = keyboard.next();
			System.out.println("Enter Studnet Mark :");
			mark = keyboard.nextDouble();
		}
		
		

	}

}
