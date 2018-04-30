package snowboardbot;

import java.util.Scanner;

/**
 * 
 * @author Samuel Harris
 * @author Benjamin Harris
 * @author Gautam Naidu
 * 
 */

public class Bot {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String chosenResort = null;
		int response = 0;

		System.out.println(
				"Hello user, my name is Shaun and i'm a bot that's designed to give you information about ski resorts that are close to WVU.");
		System.out.println(
				"I specialize in topics related to Wisp, Snowshoe, Seven Springs, Timberline, and Canaan Valley.");
		System.out.println("\nPlease enter the name of the resort that you would like to know more about.");

		chosenResort = input.nextLine().toLowerCase();

		if (chosenResort.equals("wisp") || chosenResort.equals("snowshoe") 
				|| chosenResort.equals("seven springs") || chosenResort.equals("sevensprings") 
				|| chosenResort.equals("timberline") || chosenResort.equals("canaan valley") 
				|| chosenResort.equals("canaanvalley")) {

			System.out.println("This is the information that I can assist you with:");

			System.out.println("(1) Location of Resort");
			System.out.println("(2) Snow Conditions");
			System.out.println("(3) Slope Traffic");
			System.out.println("(4) Lift Ticket Prices");
			System.out.println("(5) Trail Overviews");
			System.out.println("(6) Places to Eat");
			System.out.println("(7) Lodging");
			System.out.println("(8) Prices for Rental Equipment");
			System.out.println("(9) Prices for Buying Equipment");
			System.out.println("(10) Finding the Right Snowboard");
			System.out.println("(11) Season Passes");

			System.out.println("What are you interested in learning more about?");

			response = input.nextInt();

			if (response == 1) {

				ResortInfo.location(chosenResort);

			} else if (response == 2) {

				SlopeInfo.snowConditions(chosenResort);

			} else if (response == 3) {

				SlopeInfo.traffic(chosenResort);

			} else if (response == 4) {

				ResortInfo.liftTickets(chosenResort);

			} else if (response == 5) {

				SlopeInfo.trailOverview(chosenResort);

			} else if (response == 6) {

				FoodAndLodging.resortFood(chosenResort);

			} else if (response == 7) {

				FoodAndLodging.lodging(chosenResort);

			} else if (response == 8) {

				EquipmentPurchases.rentalPrices(chosenResort);

			} else if (response == 9) {

				EquipmentPurchases.snowboardPrices();

			} else if (response == 10) {

				EquipmentPurchases.boardSize();

			} else if (response == 11) {

				ResortInfo.seasonPasses(chosenResort);

			}
		  } 
	else {
		System.out.println("Please enter a vaild resort.");
	  }
   }
 }
