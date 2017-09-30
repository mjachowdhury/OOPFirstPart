package question2.model;

public class Actor {
	// Fields
	private String name;
	private String address;
	private int age;

	// Creating 3 Film object
	// Film[] myFilms = new Film[3];
	// private List<String> list;

	private Film[] myFilms;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param address
	 * @param age
	 */
	Actor() {
	}

	public Actor(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
		// list = new ArrayList<String>();
		myFilms = new Film[3];
	}

	// Getter and Setter methods

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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the myFilms
	 */

	public Film[] getMyFilms() {
		return myFilms;
	}

	/**
	 * @param myFilms
	 *            the myFilms to set
	 */

	public void setMyFilms(Film[] myFilms) {
		this.myFilms = myFilms;
	}

	/*
	 * public String toString() { return "Actor [name=" + name + ", address=" +
	 * address + ", age=" + age + ", myFilms=" + Arrays.toString(myFilms) + "]";
	 * }
	 */

	public String toString() {
		String actorText = "Actor [name=" + name + ", address=" + address + ", age=" + age + "]";
		String filmText = "";
		// added the film text
		for (int i = 0; i < myFilms.length; i++) {
			filmText += myFilms[i].toString();
		}

		return actorText + "\n\t" + filmText;
	}

	/*
	 * This method will print the details.
	 */
	public void print() {
		System.out.println(toString());
	}
}
