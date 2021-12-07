package ModelViewController;

import java.util.ArrayList;

public class Student {//Model class for Student
	private ArrayList<Course> Courses = new ArrayList<Course>(); //private ArrayList to hold the courses student is enrolled in
	private String permissionStatus; //private string to hold permissionStatus that will be used to dictate which posts this student can comment on and like
	private String name;//private variable to hold the students name
	private int studentNumber;//private variable to hold the students Student number
	
	public ArrayList<Course> allCourses() { //method to return all courses student is enrolled in
		return Courses;
	}
	
	public void setPermissionStatus(String permissionStatus) { //method to set students permissionStatus
		this.permissionStatus = permissionStatus;
	}
	
	public String getPermissionStatus() {//getter for permissionStatus
		return permissionStatus;
	}
	
	public void setName(String name) {//setter for name
		this.name = name;
	}
	
	public String getName() {//getter for name
		return name;
	}
	
	public void setStudentNumber(int studentNumber) { //setter for student number
		this.studentNumber = studentNumber;
	}
	
	public int getStudentNumber() { //getter for student number
		return studentNumber;
	}
	

}
