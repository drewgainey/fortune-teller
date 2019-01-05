import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name? ");
		String nameFirst = input.nextLine();

		System.out.println("What is your last name?");
		String nameLast = input.nextLine();

		System.out.println("What is your age?");
		int age = input.nextInt();
		int retirementYears;
		if (age % 2 == 0) {
			retirementYears = 6;
		} else {
			retirementYears = 8;
		}

		input.nextLine(); // This is needed when going from string to int with input function
		System.out.println("What month were you born?, please use the number");
		System.out.println("EX: June = 6");
		int birth = input.nextInt();
		int bankBalance;
		
		

		System.out.println("What is your favorite color or the rainbow, ROYGBIV?");
		System.out.println("If you do not know what this means enter help");
		String color = input.nextLine();
		String transportation = null;
		if (color.equals("red") || color.contentEquals("Red")) {
			transportation = "car";
		} else if(color.equals("orange") || color.equals("Orange")) {
			transportation = "Kangaroo";
		}else if(color.equals("yellow") || color.equals("Yellow")) {
			transportation = "unicycle";
		}else if(color.equals("green") || color.equals("Green")) {
			transportation = "jet pack";
		}else if(color.equals("blue") || color.equals("Blue")) {
			transportation = "hover craft";
		}else if(color.equals("indigo") || color.equals("Violet")) {
			transportation = "F-16";
		}else if(color.equals("violet") || color.equals("Violet")) {
			transportation = "racecar";
		}else {color = "help";}
		while (color.equals("help") || color.equals("Help")) {
			System.out.println("ROYGBIV Stands for Red, Orange, Yellow, Green, Blue, Indigo, Violet");
			System.out.println("Please chose one of these colors");
			color = input.nextLine();
		} 

			System.out.println("How many sibilings do you have?");
		int sibilings = input.nextInt();
		String vacationHome;
		if (sibilings < 0) {
			vacationHome = "Cleveland";
		} else if (sibilings == 0) {
			vacationHome = "Paris";
		} else if (sibilings == 1) {
			vacationHome = "San Francisco";
		} else if (sibilings == 2) {
			vacationHome = "Madrid";
		} else {
			vacationHome = "Rio de Janeiro";
		}


		System.out.println(nameFirst + " " + nameLast + " will retire in " + retirementYears + " years with $"
				+ bankBalance + " in the bank," + " a vacation home in " + vacationHome + " and travel by "
				+ transportation + ".");

		input.close();
	}

}
