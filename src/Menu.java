import java.util.Scanner;

public class Menu {
	public static void displayInterface() {
		System.out.println("******************************************");
		System.out.println("**                                      **");
		System.out.println("**             Project Plan             **");
		System.out.println("**                                      **");
		System.out.println("******************************************");
		System.out.println("");
		System.out.println("Welcome to the Project Planner Application");
		System.out.println("");
	
	}

	public static int displayProjectPlanMenu() {
		System.out.println("");
		System.out.println("******************************************");
		System.out.println("Please choose from the following options:");
		System.out.println("[1] Add a Project");
		System.out.println("[2] Show all Projects");
		System.out.println("[0] Exit");

		return getUserInput();
	}
	
	public static int displayProjectMenu() {	
		System.out.println("");
		System.out.println("******************************************");
		System.out.println("Please enter the id of the project you want to update");
		System.out.println("Enter '0' if you want to exit");
	
		return getUserInput();
	}
	
	public static int displayTaskMenu() {	
		System.out.println("");
		System.out.println("******************************************");
		System.out.println("Please choose from the following options:");
		System.out.println("[1] Show all Tasks");
		System.out.println("[2] Add a Task");
		System.out.println("[0] Back");
	
		return getUserInput();
	}
	
	public static int getUserInput() {
		System.out.println("Enter your choice: ");
		Scanner obj = new Scanner(System.in);
		int input = obj.nextInt();
		
		return input;
	}
}
