package question3;

public class Lecturer {

	 

	private String name;
	private int ID;

	 

	/**
	 * @param name
	 * @param iD
	 * @param books
	 */
	public Lecturer(String name, int iD) {
		this.name = name;
		this.ID = iD;
		 
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD
	 *            the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the books
	 */
	 

	/**
	 * @param books
	 *            the books to set
	 */
	 

	/**
	 * @return the maxNoOfBooks
	 */
	 

	 
	 
	public String toString() {
		return "Lecturer Name is - " + name + "\n and ID is -" + ID;
	}

	public void print() {
		System.out.println(toString());
	}

}
