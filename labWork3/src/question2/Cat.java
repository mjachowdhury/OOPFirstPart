package question2;

public class Cat {
	
	private Person myOwner;

	private String name;
	private int age;

	/**
	 * @param name
	 * @param age
	 */
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Cat() {
	}

	
	/**
	 * @return the myOwner
	 */
	public Person getMyOwner() {
		return myOwner;
	}

	/**
	 * @param myOwner the myOwner to set
	 */
	public void setMyOwner(Person myOwner) {
		this.myOwner = myOwner;
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

	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}

	public void print() {
		System.out.println(toString());
	}

}
