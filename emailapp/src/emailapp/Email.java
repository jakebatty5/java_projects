package emailapp;
import java.util.Scanner;

public class Email {

		private String firstName;
		private String lastName;
		private String password;
		private String email;
		private String department;
		private int mailboxCapacity;
		private String alternateEmail;
		private int passwordLength = 8;
		private String companySuffix = "fwcompany.com";
		
		// Constructor to receive name
		public Email(String fName, String lName) {
			this.firstName = fName;
			this.lastName = lName;
			
			this.department = setDepartment();
			
			this.password = setPassword();
			
			// Generate the email
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."+ companySuffix;
			
		}
		
		// Ask for department
		private String setDepartment() {
			
			System.out.print("Enter the employee's department:\n1 for Sales\n2 for Development\n3 for Accounting");
			Scanner in = new Scanner(System.in);
			
			int depChoice = in.nextInt();
			
			if (depChoice == 1) {
				return "sales";
			}
			else if (depChoice == 2) {
				return "dev";
			}
			else if (depChoice == 3) {
				return "acct";
			}
			else {
				return "";
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
		public void setMailboxCapacity(int capacity) {
			this.mailboxCapacity = capacity;
		}
		
		// Set alternate email
		public void setAlternateEmail(String password) {
			this.alternateEmail = password;
		}
		
		// Change password
		public void changePassword(String password) {
			this.password = password;
		}
		
		public int getMailboxCapacity() {return mailboxCapacity;}
		public String getAlternateEmail() {return alternateEmail;}
		public String getPassword() {return password;}
		
		public String showInfo() {
			return "Display Name: " + firstName + " " + lastName +
					"\nCompany Email:" + email +
					"\nMailbox Capacity: " + mailboxCapacity;
		}
		
}
