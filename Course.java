package ModelViewController;

import java.util.ArrayList;

public class Course {
	private ArrayList<Student> enrolledStudents = new ArrayList<Student>(); //private ArrayList to hold the students enrolled in this course
	private ArrayList<Professor> professorsTeaching =new ArrayList<Professor>();//private arraylist to hold the professors that teach course
	private String courseName; //private variable to hold course name
	private int courseNumber; //private int for course number
	private String courseTime;//private string for course time
	private String courseLocation;//private string from course location
	
	public ArrayList<Student> enrolledStudents() { //method to return all students enrolled in course 
		return enrolledStudents;
	}
	
	public ArrayList<Professor> professorsTeaching() { //method to return all professors teaching course
		return professorsTeaching;
	}
	
	public void setCourseName(String courseName) { //method to set course name
		this.courseName = courseName;
	}
	
	public String getCourseName() {//getter for courseName
		return courseName;
	}
	
	public void setCourseNumber(String courseNumber) { //method to set course number
		this.courseName = courseNumber;
	}
	
	public int getCourseNumber() {//getter for courseNumber
		return courseNumber;
	}
	
	public void setCourseTime(String courseTime) { //method to set course time
		this.courseTime = courseTime;
	}
	
	public String getCourseTime() {//getter for course time
		return courseTime;
	}
	
	public void setCourseLocation(String courseLocation) { //method to set course location
		this.courseLocation = courseLocation;
	}
	
	public String getCourseLocation() {//getter for course location
		return courseLocation;
	}
	
	
	
}
