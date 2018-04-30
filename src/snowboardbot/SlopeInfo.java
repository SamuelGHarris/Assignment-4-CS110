package snowboardbot;

import java.util.Scanner;

public class SlopeInfo {

	// ----------------------------------------------------

	public static void traffic(String resort) {

		Scanner input = new Scanner(System.in);

		String day = null;

		System.out.println("Which day of the week are you planning to go to " + resort + "? (Wednesday, Saturday etc)");
		day = input.nextLine();
		if (day.contains("Monday") || day.contains("Tuesday") || day.contains("Wednesday") || day.contains("Thursday")
				|| day.contains("Friday")) {
			System.out.println(
					"There should be a very limited amount of people on the slopes, and the lift lines should be short.");
		} else if (day.contains("Saturday")) {
			System.out.println(
					"Saturday is the busiest time of the week. Expect a large amount of people and longer lift lines.");
		} else if (day.contains("Sunday")) {
			System.out.println(
					"Sunday is usually a busy day, but not as busy as Saturday. Expect quite a few people and moderate lift lines.");
		} else {
			System.out.println("Please enter a valid day");
		}
	}

	// ----------------------------------------------------

	public static void snowConditions(String resort) {

		Scanner input = new Scanner(System.in);

		float lowTemp = 0;
		float highTemp = 0;

		System.out.println("What was the temperature last night at " + resort + "?");
		lowTemp = input.nextFloat();
		System.out.println("What is the high temperature today at " + resort + "?");
		highTemp = input.nextFloat();

		if ((highTemp <= 32) && (lowTemp <= 32)) {
			System.out.println("The snow at " + resort
					+ " should be primarily powder and in good condition.\nThe resort may have gotten natural snow recently and may also be making snow.");
		} else if ((highTemp > 32) && (lowTemp <= 32)) {
			System.out.println(
					"The snow at " + resort + " will be melting and possibly slushy but still in good condition.");
		} else if ((highTemp <= 32) && (lowTemp > 32)) {
			System.out.println(
					"Watch out for icy spots in the snow at " + resort + ". The snow should be very packed and solid.");
		} else if ((highTemp > 32) && (lowTemp > 32)) {
			System.out.println("If there is still snow at " + resort
					+ " it will be slushy and melting. Some trails may be closed.");
		}
	}

	// ----------------------------------------------------

	public static void trailOverview(String resort) {

		if (resort.equalsIgnoreCase("wisp")) {

			System.out.println("At " + resort + ", there are:");
			System.out.println("10 green trails (Beginner)");
			System.out.println("14 blue trails (Intermediate)");
			System.out.println("11 black trails (Difficult)");
			System.out.println("3 terrain parks");
			System.out.println("For more information on up-to-date trail openings, visit http://www.wispresort.com");

		} else if (resort.equalsIgnoreCase("canaan valley") || resort.equalsIgnoreCase("canaanvalley")) {

			System.out.println("At " + resort + ", there are:");
			System.out.println("8 green trails (Beginner)");
			System.out.println("18 blue trails (Intermediate)");
			System.out.println("16 black trails (Difficult)");
			System.out.println("1 double black trail (Most Difficult)");
			System.out.println("1 terrain parks");
			System.out.println("For more information on up-to-date trail openings, visit https://www.canaanresort.com");

		} else if (resort.equalsIgnoreCase("timberline")) {

			System.out.println("At " + resort + ", there are:");
			System.out.println("16 green trails (Beginner)");
			System.out.println("8 blue trails (Intermediate)");
			System.out.println("5 black trails (Difficult)");
			System.out.println("6 double black trails (Most Difficult)");
			System.out.println("2 terrain parks");
			System.out.println(
					"For more information on up-to-date trail openings, visit http://www.timberlineresort.com/index.php");

		} else if (resort.equalsIgnoreCase("seven springs") || resort.equalsIgnoreCase("sevensprings")) {

			System.out.println("At " + resort + ", there are:");
			System.out.println("13 green trails (Beginner)");
			System.out.println("15 blue trails (Intermediate)");
			System.out.println("5 black trails (Difficult)");
			System.out.println("6 double black trail (Most Difficult)");
			System.out.println("8 terrain parks");
			System.out.println("For more information on up-to-date trail openings, visit http://www.7springs.com");

		} else if (resort.equalsIgnoreCase("snowshoe") || resort.equalsIgnoreCase("snow shoe")) {

			System.out.println("At " + resort + ", there are:");
			System.out.println("24 green trails (Beginner)");
			System.out.println("19 blue trails (Intermediate)");
			System.out.println("15 black trails (Difficult)");
			System.out.println("1 double black trail (Most Difficult)");
			System.out.println("5 terrain parks");
			System.out.println("For more information on up-to-date trail openings, visit https://www.snowshoemtn.com");

		}
	}
}