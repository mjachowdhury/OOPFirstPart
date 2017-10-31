package question1;

import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {

		FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("Mohammed", "Alom", "PPS-111-222", 3000.00, true);
		FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee("Chowdhury", "Hero", "PPS-333-444", 5000.00, true);
		PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("Jason", "Howard", "PPS-555-666", 12.50, 25, true);
		PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee("Sara", "Brosnan", "PPS-777-888", 14.50, 35, true);

		System.out.println("Employee Status individually:\n");
		
		System.out.printf("%s\n%s: \u20ac%s,\n\n", fullTimeEmployee1, "Earned",
				fullTimeEmployee1.calculateMonthlySalary(), "Status is:", fullTimeEmployee1.isFullTime());
		
		System.out.printf("%s\n%s: \u20ac%s,\n\n", fullTimeEmployee2, "Earned",
				fullTimeEmployee2.calculateMonthlySalary(), "Status is:", fullTimeEmployee2.isFullTime());
		
		System.out.printf("%s\n%s: \u20ac%s,\n\n", partTimeEmployee1, "Earned",
				partTimeEmployee1.calculateWeeklySalary(), "Status is:", partTimeEmployee1.isPartTime());
		
		System.out.printf("%s\n%s: \u20ac%s,\n\n", partTimeEmployee2, "Earned",
				partTimeEmployee2.calculateWeeklySalary(), "Status is:", partTimeEmployee2.isPartTime());

		ArrayList<Employee> employee = new ArrayList<Employee>();

		employee.add(fullTimeEmployee1);
		employee.add(fullTimeEmployee2);

		employee.add(partTimeEmployee1);
		employee.add(partTimeEmployee2);

		/*
		 * Employee employees[] = new Employee[4]; employees[0] =
		 * fullTimeEmployee1; employees[1] = fullTimeEmployee2; employees[2] =
		 * partTimeEmployee1; employees[3] = partTimeEmployee2;
		 */

		System.out.println(" Employees Details:\n");
		for (Employee currentEmployee : employee) {
			System.out.println(currentEmployee);// invokes toString
			System.out.println();
		}
		// get type name of each object in employees array
		for (int i = 0; i < employee.size(); i++) {
			System.out.printf("Employee %d is a %s\n", i, employee.getClass().getName());
		}
	}

}
