package question3.model;

import java.util.ArrayList;

public class StudentService {

	private ArrayList<Student> studentList;

	public StudentService() {
		this.studentList = new ArrayList<Student>();
	}

	/**
	 * @return the studentList
	 */
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	/**
	 * @param studentList
	 *            the studentList to set
	 */
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public void addStudentToList(Student s) {
		this.studentList.add(s);
	}

	public void removeStudnetFromList(Student s) {
		this.studentList.remove(s);
	}

}
