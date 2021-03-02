package emailapp;

public class EmailApp {

	public static void main(String[] args) {

		Email newUser = new Email("Jake", "Batty");
		System.out.println(newUser.showInfo());
	}
}
