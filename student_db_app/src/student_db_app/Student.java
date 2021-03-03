package student_db_app;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private String year;
	private String studentID;
	private String courses;
	private String tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor sets name and year
	public Student() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("Enter 1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior");
		this.year = in.nextLine();
		
		setStudentID();
		
	}
	
	// Generate unique ID
	private void setStudentID() {
		id++;
		// Grade level + ID
		this.studentID = year + "" + id;
		System.out.print("Student ID is " + this.studentID);
	}
	
	// Enroll in courses
	
	// Get balance
			
	// Pay tuition
	
}
