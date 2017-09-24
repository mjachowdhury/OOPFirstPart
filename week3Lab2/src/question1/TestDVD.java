package question1;

/**
 * This class is the main class.
 *
 * @author (Mohammed J Alom)
 * @version (a version number or a date)
 */
public class TestDVD
{
     public static void main(String [] args)
     {
        DVD dvd1 = new DVD();
        dvd1.setTitle("Song Bird");
        dvd1.setGenre("Blues");
        dvd1.setTitle("Eva Cassidy");
        
        DVD dvd2 = new DVD("Johnny b. Goode","Chuck Berry","George Hook");
        
        dvd1.print();
        dvd2.print();
        
     }
     
     
     
}
