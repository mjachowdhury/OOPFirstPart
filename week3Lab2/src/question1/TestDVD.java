/*Q1
What follows is the main class called TestDVD
public class TestDVD
{
    public static void main(String[] args)
    {
        DVD  dvd1 = new DVD(); //
        dvd1.setTitle("Song Bird"); //
        dvd1.setGenre("Blues");
        dvd1.setArtist("Eva Cassidy")
        dvd1.print();
        
        DVD dvd2 = new DVD("Johnny B. Goode", "Chuck Berry");
        print();//
    }
  
}

Part a)	Write this code into BlueJ explaining each line marked with a comment.
Part b)	Fix any problems encountered.
Part c)	To ensure this class works you will need to create the DVD class which will be a template for creating as many DVD objects as you require of the same type. Firstly you need to draw the class diagram and then write your code.  Use the main test above to see if it works.
*/
package question1;

/**
 * This class is the main class.
 *
 * @author (Mohammed J Alom)
 * @version (a version number or a date)
 */
public class TestDVD {
	public static void main(String[] args) {
		DVD dvd1 = new DVD();// Creating new object for DVD with instance
								// variable of dvd1
		dvd1.setTitle("Song Bird"); // Setting the title
		dvd1.setGenre("Blues");
		dvd1.setTitle("Eva Cassidy");// Setting the artist

		DVD dvd2 = new DVD("Johnny b. Goode", "Chuck Berry", "George Hook");

		// print(); // It will not work unless call by its instance variable
		dvd1.print();
		dvd2.print();

	}

}
