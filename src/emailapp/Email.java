package emailapp;
import java.util.Scanner;

public class Email {

		private String firstName;
		private String lastName;
		private String password;
		private String department;
		private int mailboxCapacity;
		private String alternateEmail;
		private int passwordLength = 8;
		
		// Constructor to receive name
		public Email(String fName, String lName) {
			this.firstName = fName;
			this.lastName = lName;
			System.out.println("Name set to "+ this.firstName + " " + this.lastName);
			
			this.department = setDepartment();
			System.out.println("Department set to " + this.department);
			
			this.password = setPassword();
			System.out.println("Password set to " + this.password);
			
		}
		
		// Ask for department
		private String setDepartment() {
			
			System.out.print("Enter the employee's department:\n1 for Accounting\n2 for Development\n3 for Accounting");
			Scanner in = new Scanner(System.in);
			
			int depChoice = in.nextInt();
			
			if (depChoice == 1) {
				return "Accounting";
			}
			else if (depChoice == 2) {
				return "Development";
			}
			else if (depChoice == 3) {
				return "Accounting";
			}
			else {
				return "NA";
			}
		}
		
		// Generate random password
		private String setPassword() {
			
			String charoptions = "abcdefghijklm12345";
			char[] password = new char[passwordLength];
			
			for (int i=0; i < passwordLength; i++) {
				int rand = (int) (Math.random() * charoptions.length());
				password[i] = charoptions.charAt(rand);
			}
			
			return new String(password);
			
		}
		
		
		// Set mailbox capacity
		
		// Set alternate email
		
		// Change password
		
}
