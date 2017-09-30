package question1;

/**
 * This class hold the details of the DVD.
 *
 * @author (Mohammed J Alom)
 * @version (a version number or a date)
 */
public class DVD
{
    // instance variables - replace the example below with your own
    private String title;
    private String genre;
    private String artist;
    
    public DVD(){}

    /**
     * Constructor for objects of class DVD
     */
    public DVD(String title,String genre,String artist)
    {
        // Initialize instance variables
        this.title = title;
        this.genre = genre;
        this.artist = artist;
    }

    //Getter and setter
    public String getTitel()
    {
        // put your code here
        return title; 
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getGenre()
    {
        // put your code here
        return genre; 
    }
    
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    
    public String getArtist()
    {
        // put your code here
        return artist; 
    }
    
    public void setArtist(String artist)
    {
        this.artist = artist;
    }
    
    public String toString ()
    {
        return "DVD Details : " + title + " genre " +genre+ " and Artist is " 
                                + artist;
    }
    
    public void print()
    {
        System.out.println(toString());
    }
}

