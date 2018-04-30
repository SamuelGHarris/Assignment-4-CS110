package snowboardbot;

public class ResortInfo {

	// ----------------------------------------------------

	public static void liftTickets(String resort) {

		if (resort.equalsIgnoreCase("wisp")) {
			System.out.println("Lift tickets at " + resort + " cost (Weekday-Weekend):");
			System.out.println("$49-$69 for a Morning Pass (9 AM-1 PM)");
			System.out.println("$49-$74 for a Twilight Pass (1 PM-9 PM)");
			System.out.println("$29-$59 for a Night Pass (5 PM-9 PM)");
			System.out.println("$59-$79 for an All-Day Pass (9 AM-9 PM)");
		}

		else if (resort.equalsIgnoreCase("sevensprings") || resort.equalsIgnoreCase("seven springs")) {
			System.out.println("Lift tickets at " + resort + " cost (Weekday-Weekend):");
			System.out.println("$59-$79 for a Twilight Pass (1 PM-9 PM)");
			System.out.println("$46-$46 for a Night Pass (4 PM-9 PM)");
			System.out.println("$65-$85 for an All-Day Pass (9 AM-9 PM)");
		}

		else if (resort.equalsIgnoreCase("canaanvalley") || resort.equals("canaan valley")) {
			System.out.println("Lift tickets at " + resort + " cost (Weekday-Weekend):");
			System.out.println("$42-$58 for a Half-Day Pass");
			System.out.println("$52-$68 for an All-Day Pass");
		}

		else if (resort.equalsIgnoreCase("snowshoe")) {
			System.out.println("Lift tickets at " + resort + "cost (Weekday-Weekend):");
			System.out.println("$79-$99 for an All-Day Pass (9 AM-1 PM)");
		}

		else if (resort.equalsIgnoreCase("timberline")) {
			System.out.println("Lift tickets at " + resort + " cost (Weekday-Weekend):");
			System.out.println("$58-N/A for a Half-Day Pass (12:30 PM-4:30 PM)");
			System.out.println("$58-$78 for a Twilight Pass (12:30 PM-9 PM)");
			System.out.println("$49-$47 for a Night Pass (4:30 PM-9 PM)");
			System.out.println("$72-$92 for an All-Day Pass (9 AM-9 PM)");
			System.out.println("\nFor any college student, a lift ticket is only $25 any day of the week");
		}
	}

	// ----------------------------------------------------

	public static void location(String resort) {

		if (resort.equalsIgnoreCase("wisp")) {
			System.out.println("" + resort + " is located in McHenry, Maryland and is 41.8 miles away from WVU.");
			System.out.println(" It takes approximately 50 minutes by car to get there.");
		}

		else if (resort.equalsIgnoreCase("sevensprings") || resort.equalsIgnoreCase("seven springs")) {
			System.out.println("" + resort + " is located in Champion, Pennsylvania and is 58 miles away from WVU.");
			System.out.println(" It takes approximately 1 hour and 18 minutes by car to get there.");
		}

		else if (resort.equalsIgnoreCase("canaanvalley") || resort.equals("canaan valley")) {
			System.out.println("" + resort + " is located in Davis, West Virginia and is 82.8 miles away from WVU.");
			System.out.println(" It takes approximately 2 hours and 2 minutes by car to get there.");
		}

		else if (resort.equalsIgnoreCase("snowshoe")) {
			System.out.println("" + resort + " is located in Snowshoe, West Virginia and is 119 miles away from WVU.");
			System.out.println(" It takes approximately 2 hours and 44 minutes by car to get there.");
		}

		else if (resort.equalsIgnoreCase("timberline")) {
			System.out.println("" + resort + " is located in Davis, West Virginia and is 81.8 miles away from WVU.");
			System.out.println(" It takes approximately 2 hours by car to get there.");
		}
	}

	// ----------------------------------------------------

	public static void seasonPasses(String resort) {

		if (resort.equalsIgnoreCase("wisp")) {
			System.out.println("A season pass at " + resort + " costs:");
			System.out.println("For students ages 6 to 22 -- $329");
			System.out.println("For ages 19 to 29 -- $399");
			System.out.println("For ages 30 to 64 -- $599");
			System.out.println("For ages 65 to 69 -- $349");
			System.out.println("Discounted rates can occur if passes are bought before 9/4/18");
		}

		else if (resort.equalsIgnoreCase("sevensprings") || resort.equalsIgnoreCase("seven springs")) {
			System.out.println("A season pass at " + resort + " costs:");
			System.out.println("For ages under 5 -- $49");
			System.out.println("For ages 6 to 11 -- $579");
			System.out.println("For ages 12 to 17 -- $619");
			System.out.println("For ages 18 to 64 -- $669");
			System.out.println("For ages 65 to 69 -- $619");
			System.out.println("For ages 70 to 79 -- $309");
			System.out.println("For ages over 80 -- $49");
			System.out.println("Discounted rates can occur if passes are bought before 5/15/18");
		}

		else if (resort.equalsIgnoreCase("canaanvalley") || resort.equals("canaan valley")) {
			System.out.println("A season pass at " + resort + " costs:");
			System.out.println("For ages 6 to 12 -- $325");
			System.out.println("For ages 13 to 17 -- $350");
			System.out.println("For ages 18 to 59 -- $550");
			System.out.println("For ages 60 to 69 -- $350");
			System.out.println("For College Students and Military Members -- $325");
			System.out.println("Family Pass -- $1400");
			System.out.println("WV Family Pass -- $1200");
			System.out.println("Discounted rates can occur if passes are bought before 11/30/18");
		}

		else if (resort.equalsIgnoreCase("snowshoe")) {
			System.out.println("A season pass at " + resort + " costs:");
			System.out.println("For ages 0 to 4 -- $29");
			System.out.println("For ages 5 to 12 -- $259");
			System.out.println("For ages 13 to 17 -- $349");
			System.out.println("For ages 18 to 69 -- $349");
			System.out.println("For ages 70+ -- $259");
			System.out.println("For College Students -- $259");
			System.out.println("For Military Members -- $249");
		}

		else if (resort.equalsIgnoreCase("timberline")) {
			System.out.println("There are no season passes currently available for " + resort + "");

		}
	}
}
