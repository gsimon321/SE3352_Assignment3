package ModelViewController;

import java.util.ArrayList;

public class Professor {
	private ArrayList<Course> taughtCourses = new ArrayList<Course>(); //private ArrayList to hold the courses student is enrolled in
	private String permissionStatus; //private string to hold permissionStatus that will be used to determine the professors ability to edit and creat courses
	private String name;//private variable to hold the professors name
	private int professorNumber;//private variable to hold the professors Professor number
	
	public ArrayList<Course> allTaughtCourses() { //method to return all courses professor teaches
		return taughtCourses;
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
		this.professorNumber = studentNumber;
	}
	
	public int getStudentNumber() { //getter for student number
		return professorNumber;
	}
}
