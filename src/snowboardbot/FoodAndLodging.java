package snowboardbot;

public class FoodAndLodging {

	// ----------------------------------------------------

	public static void resortFood(String resort) {

		if (resort.equalsIgnoreCase("wisp")) {
			System.out.println("At " + resort + ", a few different places to eat include:");
			System.out.println("DC's Bar and Restaurant- Family sit-down restaurant");
			System.out.println("Wisp Food Court- Quick meals");
			System.out.println("Wispers Mountainside Bar- Sports Bar");
			System.out.println("Sundown Cafe- Snacks and Drinks");
		}

		else if (resort.equalsIgnoreCase("sevensprings") || resort.equalsIgnoreCase("seven springs")) {
			System.out.println("At " + resort + ", a few different places to eat near the resort include:");
			System.out.println("Helen's- Higher class dining");
			System.out.println("Slopeside- Family sit-down restaurant ");
			System.out.println("Timbers- Burgers and comfort food");
			System.out.println("The Grille- Bar and grill");
		}

		else if (resort.equalsIgnoreCase("canaanvalley") || resort.equalsIgnoreCase("canaan valley")) {
			System.out.println("At " + resort + " a few places to eat near the resort include:");
			System.out.println("Hickory Dining Room- Family sit-down restaurant");
			System.out.println("Laurel Lounge- Bar");
			System.out.println("Seasons Cafe- Lighter, healthier meals");
			System.out.println("Quenchers Pub- Bar");
		}

		else if (resort.equalsIgnoreCase("snowshoe")) {
			System.out.println("At " + resort + ", a few different places to eat include:");
			System.out.println("Cheat Mountain Pizza- Sit-down pizza restaurant");
			System.out.println("Old Spruce Tavern- Bar");
			System.out.println("Southern Mountain Grille- Higher Class Dining");
			System.out.println("The Boathouse- Barbeque");
		}

		else if (resort.equalsIgnoreCase("timberline")) {
			System.out.println("At " + resort + ", a few places to eat near the resort include:");
			System.out.println("Timberline Cafeteria- Quick Meals");
			System.out.println("Timber's Pub- Bar");
			System.out.println("Fireside Grille- Bar and Grill");
		}

		else {
			System.out.println("Please re-enter a valid resort name");
		}

	}

	// ----------------------------------------------------

	public static void lodging(String resort) {

		if (resort.equalsIgnoreCase("wisp")) {
			System.out.println("A few places to stay at " + resort + " include:");
			System.out.println("The Wisp Lodge");
			System.out.println("Carmel Cove Inn");
			System.out.println("Lake Pointe Inn");
			System.out.println("Railey Mountain Lake Vacations");
		}

		else if (resort.equalsIgnoreCase("sevensprings") || resort.equalsIgnoreCase("seven springs")) {
			System.out.println("A few places to stay at " + resort + " include:");
			System.out.println("The Seven Springs Hotel");
			System.out.println("Log Cabin Lodge and Suites");
			System.out.println("Alpine Retreat Bed and Breakfast");
			System.out.println("Hidden Valley Resort");
		}

		else if (resort.equalsIgnoreCase("canaanvalley") || resort.equalsIgnoreCase("canaan valley")) {
			System.out.println("A few places to stay at " + resort + " include:");
			System.out.println("Canaan Lodge");
			System.out.println("Bright Morning Inn");
			System.out.println("Canaan Village Inn");
			System.out.println("Black Bear Resort");
		}

		else if (resort.equalsIgnoreCase("snowshoe")) {
			System.out.println("A few places to stay at " + resort + " include:");
			System.out.println("Allegheny Springs");
			System.out.println("Soaring Eagle");
			System.out.println("Rimfire Lodge");
			System.out.println("Powderidge");
		}

		else if (resort.equalsIgnoreCase("timberline")) {
			System.out.println("A few places to stay at " + resort + " include:");
			System.out.println("Timber's Inn Hotel");
			System.out.println("Bunkhouse");
			System.out.println("Alpine Lodge");
			System.out.println("North Fork Mountain Inn");
		}

		else {
			System.out.println("Please re-enter a valid resort name");
		}

	}

}
