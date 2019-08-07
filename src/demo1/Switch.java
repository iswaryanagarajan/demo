package demo1;

public class Switch {

	public static void main(String[] args) {
		String a="Login";
		switch (a)
		{
		case "Login":
		System.out.println("Login");
		break;
		case "Home":
		System.out.println("Home");
		break;
		case "Logout":
		System.out.println("Logout");
		case "Main screen":
		System.out.println("Main screen");
		break;
		default:
		System.out.println("Nothing matched");
		}

	}

}
