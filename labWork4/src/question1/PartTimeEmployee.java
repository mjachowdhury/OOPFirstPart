package question1;

public class PartTimeEmployee extends Employee {
	
	private double hourlyPay;
	private int hours;
	private boolean isPartTime = true;

	/**
	 * @param firstName
	 * @param lastName
	 * @param ppsn
	 * @param hourlyPay
	 */
	public PartTimeEmployee(String firstName, String lastName, String ppsn, double hourlyPay,int hoursWorked,boolean isPartTime) {
		super(firstName, lastName, ppsn);
		setHourlyPay(hourlyPay);
		setHours(hoursWorked);
		setPartTime(isPartTime);
		//this.hourlyPay = hourlyPay;
		//this.hours = hoursWorked;
		//this.isPartTime = isPartTime;
	}

	
	/**
	 * @return the isPartTime
	 */
	public boolean isPartTime() {
		return isPartTime;
	}


	/**
	 * @param isPartTime the isPartTime to set
	 */
	public void setPartTime(boolean isPartTime) {
		this.isPartTime = isPartTime;
	}


	/**
	 * @return the hourlyPay
	 */
	public double getHourlyPay() {
		return hourlyPay;
	}


	/**
	 * @param hourlyPay the hourlyPay to set
	 */
	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = (hourlyPay <0.0 ) ? 0.0 : hourlyPay;
	}


	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}


	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hoursWorked) {
		this.hours = ((hoursWorked >=0 ) && (hoursWorked < 40)) ? hoursWorked :0;
	}


	public double calculateWeeklySalary(){
		 return getHourlyPay() * getHours();
	}
	@Override
	public boolean getStatus() {
		if(!isPartTime()){
			//System.out.println("Your are not part time employee");
			return false;
		}else
			return isPartTime;
		//System.out.println("Your are part time employee.");
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Part Time Employee: %s\n%s: \u20ac%s, %s: ",
					super.toString(), "Hourly Pay ",getHourlyPay(),
									"Hours Worked ", getHours(),
									"Is Part Time :",isPartTime());
	}
	
	

}
