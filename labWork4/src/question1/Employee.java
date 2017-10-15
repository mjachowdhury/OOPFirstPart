package question1;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String PPSN;
	/**
	 * @param firstName
	 * @param lastName
	 * @param pPSN
	 */
	public Employee(String firstName, String lastName, String ppsn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.PPSN = ppsn;
	}
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the pPSN
	 */
	public String getPPSN() {
		return PPSN;
	}


	/**
	 * @param pPSN the pPSN to set
	 */
	public void setPPSN(String pPSN) {
		PPSN = pPSN;
	}


	public abstract boolean getStatus();
	
	public String toString(){
		return String.format("%s %s\nPPS Number : %s", getFirstName(),getLastName(),getPPSN() );
	}

}