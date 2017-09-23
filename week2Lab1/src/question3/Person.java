package question3;

public class Person {
	private int stars;
	private String phone;
	private String name;
	
	public Person(int stars, String phone, String name){
		this.stars = stars;
		this.phone = phone;
		this.name = name;
	}

	/**
	 * @return the stars
	 */
	public int getStars() {
		return  stars;
	}

	/**
	 * @param stars the stars to set
	 */
	public void setStars(int stars) {
		this.stars = stars;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	 
	public String toString() {
		return "Person Name = " + name + " jumped=" + stars + " times and phone number is " + phone + ".";
	}
	
	public void print(){
		System.out.println(toString());
	}
	public String jump(){
		return "I jumped";
	}
 
}
