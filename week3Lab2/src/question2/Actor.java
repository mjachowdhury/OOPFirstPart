package question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Actor {
	// Fields
	private String name;
	private String address;
	private int age;

	// Creating 3 Film object
	//Film[] myFilms = new Film[3];
	private List<String> list;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param address
	 * @param age
	 */
	public Actor(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
		list = new ArrayList<String>();
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

	// ToString method
	public String toString() {
		return "Actor Name : " + name + " | Address : " + address + "| Age : " + age + " | My Films Name : "
				+ Arrays.toString(myFilms) + ".";
	}

	/*
	 * This method will print the details.
	 */
	public void print() {
		System.out.println(toString());
	}

}
