package question3.controller;

import question3.model.Student;
import question3.model.StudentService;

public class StudentController {

	private StudentService studentService;

	public StudentController() {

		this.studentService = new StudentService();
		// this.studentList = new ArrayList<Student>();
	}

	public void addStudent(String firstNameFromView, String lastNameFromView, double markFromView) {
		Student s = new Student(firstNameFromView, lastNameFromView, markFromView);

		s.setFirstName(firstNameFromView);
		s.setLastName(lastNameFromView);
		s.setMark(markFromView);

		// this.studentService.getStudentList().add(s);

		this.studentService.addStudentToList(s);

		// this.studentService.addStudentToList(new
		// Student(firstNameFromView,lastNameFromView,markFromView));
	}

	/*
	 * public void removeStudent(){ Student s = new Student();
	 * studentService.removeStudnetFromList(s); }
	 */

}
