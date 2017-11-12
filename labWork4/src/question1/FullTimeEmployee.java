package question1;

public class FullTimeEmployee extends Employee {

	private double monthlySalary;
	private boolean isFullTime = true;

	/**
	 * @param firstName
	 * @param lastName
	 * @param ppsn
	 * @param monthlySalary
	 */
	public FullTimeEmployee(String firstName, String lastName, String ppsn, double monthlySalary, boolean isFullTime) {

		super(firstName, lastName, ppsn);

		setMonthlySalary(monthlySalary);
		setFullTime(isFullTime);

		// this.monthlySalary = monthlySalary;
		// this.isFullTime = isFullTime;
	}

	/**
	 * @return the monthlySalary
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}

	/**
	 * @param monthlySalary
	 *            the monthlySalary to set
	 */
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary < 0.0 ? 0.0 : monthlySalary;
	}

	/**
	 * @return the isFullTIme
	 */
	public boolean isFullTime() {
		return isFullTime;
	}

	/**
	 * @param isFullTIme
	 *            the isFullTIme to set
	 */
	public void setFullTime(boolean isFullTime) {
		this.isFullTime = isFullTime;
	}

	public double calculateMonthlySalary() {
		return getMonthlySalary();
	}

	@Override
	public void getStatus() {
		if (!isFullTime()) {
			System.out.println("You are not full time employee");
			// return false;
		} else
			// return isFullTime;
			System.out.println("Full Time employee");
	}

	 
/*
	public String toString() {
		return String.format("Fulltime Employee: %s\n%s : \u20ac%s,", 
				super.toString(), "Monthly Salary",
				getMonthlySalary(), 
				"Status is:", isFullTime());
	}*/
	
	
	/*public String toString() {
		return "FullTimeEmployee MonthlySalary : " + monthlySalary + "\nIsFullTime : " + isFullTime;
	}*/
	
	public void print(){
		System.out.println(toString());
	}

	 
	public String toString() {
		return super.toString() +"\nMonthlySalary : " + monthlySalary + "\nStatus Is FullTime? : " + isFullTime;
	}

	 
	

}
