import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the fourtune teller app ");
		System.out.println("I will tell you your future ");
		System.out.println("All you must do is anwser a few simple questions");
		System.out.println("To exit enter quit at any time");
		System.out.println("Lets get started");
		System.out.println("What is your first name? ");
		String nameFirst = input.nextLine();
		if (nameFirst.equals("Quit") || nameFirst.equals("quit")) {
			System.out.println("Nobody likes a quitter....");
			System.exit(0);
		}

		System.out.println("What is your last name?");
		String nameLast = input.nextLine();
		if (nameLast.equals("Quit") || nameLast.equals("quit")) {
			System.out.println("Nobody likes a quitter....");
			System.exit(0);
		}

		System.out.println("What is your age?");
		String ageInput = input.nextLine();
		if (ageInput.equals("Quit") || ageInput.equals("quit")) {
			System.out.println("Nobody likes a quitter....");
			System.exit(0);
		}
		int age = Integer.parseInt(ageInput);
		int retirementYears;
		if (age % 2 == 0) {
			retirementYears = 6;
		} else {
			retirementYears = 890;
		}

		System.out.println("What month were you born?, please use the number");
		System.out.println("EX: June = 6");
		String birthMonthInput = input.nextLine();
		if (birthMonthInput.equals("Quit") || birthMonthInput.equals("quit")) {
			System.out.println("Nobody likes a quitter....");
			System.exit(0);
		}
		int birthMonth = Integer.parseInt(birthMonthInput);
		int bankBalance = 0;
		while (bankBalance == 0) {
			if (birthMonth <= 0) {
				bankBalance = 0;
			} else if (birthMonth <= 4) {
				bankBalance = 1;
				break;
			} else if (birthMonth <= 9) {
				bankBalance = 724;
				break;
			} else if (birthMonth <= 12) {
				bankBalance = 10000000;
				break;
			}
			System.out.println("Please choose a number 1-12 ");
			birthMonth = input.nextInt();

		}

		System.out.println("What is your favorite color or the rainbow, ROYGBIV?");
		System.out.println("If you do not know what this means enter help");
		String color = input.nextLine();
		String transportation = null;
		while (color.equals("help") || color.equals("Help") || transportation == null) {
			if (color.equals("red") || color.contentEquals("Red")) {
				transportation = "car";
				break;
			} else if (color.equals("orange") || color.equals("Orange")) {
				transportation = "Kangaroo";
				break;
			} else if (color.equals("yellow") || color.equals("Yellow")) {
				transportation = "unicycle";
				break;
			} else if (color.equals("green") || color.equals("Green")) {
				transportation = "jet pack";
				break;
			} else if (color.equals("blue") || color.equals("Blue")) {
				transportation = "hover craft";
				break;
			} else if (color.equals("indigo") || color.equals("Violet")) {
				transportation = "F-16";
				break;
			} else if (color.equals("violet") || color.equals("Violet")) {
				transportation = "racecar";
				break;
			} else if (color.equals("quit") || color.equals("Quit")) {
				System.out.println("Nobody likes a quitter....");
				System.exit(0);
			} else {
				System.out.println("ROYGBIV Stands for Red, Orange, Yellow, Green, Blue, Indigo, Violet");
				System.out.println("Please chose one of these colors");
				color = input.nextLine();
			}
		}

		System.out.println("How many sibilings do you have?");
		String sibilingsInput = input.nextLine();
		if (sibilingsInput.equals("Quit") || sibilingsInput.equals("quit")) {
			System.out.println("Nobody likes a quitter....");
			System.exit(0);
		}
		int sibilings = Integer.parseInt(sibilingsInput);
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
