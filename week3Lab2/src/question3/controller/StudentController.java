package question3.controller;

import java.util.ArrayList;

import question3.model.Student;

public class StudentController {
	private ArrayList<Student> student;
	
	public StudentController(){
		this.student = new ArrayList<Student>();
	}
	
	//ArrayList<Student> student = new ArrayList<Student>();
	//private int numberOfStudent = 0;
	
	public void addStudent(String firstNameFromView,String lastNameFromView,double markFromView){
		//Student s = new Student(firstNameFromView,lastNameFromView,markFromView);
		//student.add(s);
		Student s = new Student();
		s.setFirstName(firstNameFromView);
		s.setLastName(lastNameFromView);
		s.setMark(markFromView);
		student.add(s);		
	}
	
	public void removeStudent(){
		Student s = new Student();
		student.remove(s);
	}
	
	 
	

}
