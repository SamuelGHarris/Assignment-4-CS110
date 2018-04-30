package snowboardbot;

import java.util.Scanner;

public class EquipmentPurchases {

	// ----------------------------------------------------

	public static void rentalPrices(String resort) {

		if (resort.equalsIgnoreCase("wisp")) {

			System.out.println("Rentals cost (Ski-Snowboard):");
			System.out.println("$14-$13 from the WVU Rec Center");
			System.out.println("$34-$34 from " + resort + ".");

		} else if (resort.equalsIgnoreCase("canaan valley") || resort.equalsIgnoreCase("canaanvalley")) {

			System.out.println("Rentals cost (Ski-Snowboard):");
			System.out.println("$38-$46 from the WVU Rec Center");
			System.out.println("$35-$43 from " + resort + ".");

		} else if (resort.equalsIgnoreCase("timberline")) {

			System.out.println("Rentals cost (Ski-Snowboard):");
			System.out.println("$14-$13 from the WVU Rec Center");
			System.out.println("$45-$45 from " + resort + ".");

		} else if (resort.equalsIgnoreCase("seven springs") || resort.equalsIgnoreCase("sevensprings")) {

			System.out.println("Rentals cost (Ski-Snowboard):");
			System.out.println("$14-$13 from the WVU Rec Center");
			System.out.println("$50-$50 from " + resort + ".");

		} else if (resort.equalsIgnoreCase("snowshoe") || resort.equalsIgnoreCase("snow shoe")) {

			System.out.println("Rentals cost (Ski-Snowboard):");
			System.out.println("$14-$13 from the WVU Rec Center");
			System.out.println("$45-$45 from " + resort + ".");

		}
	}

	// ----------------------------------------------------

	public static void snowboardPrices() {

		Scanner input = new Scanner(System.in);

		int response = 0;

		System.out.println("\nWhat type of board are you interested in purchasing?:");
		System.out.println("(1) All Mountain");
		System.out.println("(2) Park");
		System.out.println("(3) Powder");

		response = input.nextInt();

		if (response == 1) {

			System.out.println("\nBurton sells All Mountain boards for prices between $270 and $550.");

		} else if (response == 2) {

			System.out.println("\nBurton sells Park boards for prices between $280 and $410.");

		} else if (response == 3) {

			System.out.println("\nBurton sells Powder boards for prices between $420 and $610.");

		}
	}

	// ----------------------------------------------------

	public static void boardSize() {
		
		System.out.println("\nHere is a chart that will help you determine the best board size for you.");
		System.out.println("This chart was found at: https://www.evo.com/guides/how-to-choose-a-snowboard-and-size-chart");
		System.out.println("\n");
		System.out.println("|Rider  |Rider        |Snowboard |");
		System.out.println("|Height |Weight (lbs) |Size (cm) |");
		System.out.println("|--------------------------------|");
		System.out.println("|4'10\"  |   110-120   | 128-136  |");
		System.out.println("|------ |-------------|----------|");
		System.out.println("|5'     |   115-130   | 133-141  |");
		System.out.println("|------ |-------------|----------|");
		System.out.println("|5'2\"   |   125-135   | 139-147  |");
		System.out.println("|------ |-------------|----------|");
		System.out.println("|5'4\"   |   135-145   | 144-152  |");
		System.out.println("|------ |-------------|----------|");
		System.out.println("|5'6\"   |   140-155   | 149-157  |");
		System.out.println("|------ |-------------|----------|");
		System.out.println("|5'8\"   |   150-165   | 154-162  |");
		System.out.println("|------ |-------------|----------|");
		System.out.println("|5'10\"  |   160-175   | 159-167  |");
		System.out.println("|------ |-------------|----------|");
		System.out.println("|6'     |   170-185   |   160+   |");
		System.out.println("|------ |-------------|----------|");
		System.out.println("|6'2\"   |   180-195   |   160+   |");
		System.out.println("|------ |-------------|----------|");
		System.out.println("|6'4\"   |   190-205   |   160+   |");
		System.out.println("|------ |-------------|----------|");
		
	}

}
