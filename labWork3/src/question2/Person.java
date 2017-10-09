package question2;

import java.util.ArrayList;

public class Person {

	//private Cat[] myCat;
	private ArrayList<Cat> myCat;
	
	private String name;
	private String address;
	private int age;

	/**
	 * @param name
	 * @param address
	 * @param age
	 */
	public Person(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
		//myCat = new Cat[20];
		myCat = new ArrayList<Cat>();
	}

	public Person() {
	}

	

	/**
	 * @return the myCat
	 * This is for to do with array
	 */
//	public Cat[] getMyCat() {
//		return myCat;
//	}

	/**
	 * @param myCat the myCat to set
	 */
//	public void setMyCat(Cat[] myCat) {
//		this.myCat = myCat;
//	}

	//this is to do with arrayList
	/**
	 * @return the myCat
	 */
	public ArrayList<Cat> getMyCat() {
		return myCat;
	}

	/**
	 * @param myCat the myCat to set
	 */
	public void setMyCat(ArrayList<Cat> myCat) {
		this.myCat = myCat;
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

	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	public void print() {
		System.out.println(toString());
	}
	
	/*
	 * This method will add 20 cat in the person object.
	 */
	public void addCat(Cat cat){
		if(myCat.size() > 20){
			throw new IllegalArgumentException("Exceeded the limit");
		}
		myCat.add(cat);
	}

}
