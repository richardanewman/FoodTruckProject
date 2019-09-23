package foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {
	private FoodTruck[] truckArr = new FoodTruck[5];
	private FoodTruck newTruck;
	private int index = 0;

	public static void main(String[] args) {
		FoodTruckApp user = new FoodTruckApp();
		user.run();

	}

	private void run() {
		int count = 0;

		Scanner kb = new Scanner(System.in);
		String inputName = "", inputType = "";
		double inputRating;
		System.out.println("****************************************************************");
		System.out.println("*                Welcome to Food Truck Rating App              *");
		System.out.println("****************************************************************");
		System.out.println("*          Please enter and rate up to five food trucks.       *");
		System.out.println("*    Enter the truck's name, food type, and rating 0.0-10.0    *");
		System.out.println("*     0.0 == worst food ever and 10.0 == better than mom's     *");
		System.out.println("*           You will be prompted for each entry field.         *");
		System.out.println("* If you have less than five entries, type 'quit' to continue. *");
		System.out.println("****************************************************************");

		while (count < 5) {

			newTruck = new FoodTruck();
			System.out.print("Please enter truck's name: ");
			inputName = kb.nextLine();

			if (inputName.equalsIgnoreCase("quit")) {
				break;
			}

			System.out.print("Please enter food type: ");
			inputType = kb.nextLine();

			if (inputType.equalsIgnoreCase("quit")) {
				break;
			}

			System.out.print("Please enter truck's rating: ");
			inputRating = kb.nextDouble();
			kb.nextLine();

			newTruck.setName(inputName);
			newTruck.setType(inputType);
			newTruck.setRating(inputRating);
			newTruck.setNextId();
			addTruck(newTruck);

			count++;
		}
		
		int press = 0;
		
		do {
			System.out.println("***********************************************************");
			System.out.println("*              Thank you for your entries!                *");
			System.out.println("***********************************************************");
			System.out.println("*  Press 1 to list all existing food trucks               *");
			System.out.println("*  Press 2 to see the average rating for your food trucks *");
			System.out.println("*  Press 3 to display highest-rated food truck            *");
			System.out.println("*  Press 4 to quit the program                            *");
			System.out.println("***********************************************************");
			press = kb.nextInt();
			if (press == 1) {
				printTruckArr(getTrucks());
			}
			if (press == 2) {
				getAverage(getTrucks());
			}
			if (press == 3) {
				getHighest(getTrucks());
			}

		} while (press != 4);
		System.out.println("***********************************************************");
		System.out.println("*              Thank you! Have a great day!               *");
		System.out.println("***********************************************************");
		
		kb.close();
	}

	private void addTruck(FoodTruck truck) {
		truckArr[index] = truck;
		index++;
	}

	private FoodTruck[] getTrucks() {
		FoodTruck[] copyTrucks = new FoodTruck[index];

		for (int i = 0; i < index; i++) {
			copyTrucks[i] = truckArr[i];
		}
		return copyTrucks;
	}

	private void printTruckArr(FoodTruck[] trucks) {
		for (FoodTruck truck : trucks) {
			truck.displayTrucks();
		}
	}

	private void getAverage(FoodTruck[] trucks) {
		double average = 0;
		double sum = 0;
		for (FoodTruck truck : trucks) {
			double ratings = truck.getRating();
			sum = sum + ratings;
		}
		average = (sum / trucks.length);
		System.out.println("The average rating for your list of food trucks is: " + average + "\n");

	}
	
	private void getHighest(FoodTruck[] trucks) {
		double highest = 0;
		String truckName = "";
		String truckType = "";
		int truckID = 0;
		for (FoodTruck truck : trucks) {
			double ratings = truck.getRating();
			if (highest < ratings) {
				highest = ratings;
				truckName = truck.getName();
				truckType = truck.getType();
				truckID = truck.getNextId();
				
			}
		}
		System.out.print("\nThe highest rating for your food truck list is " + highest);
		System.out.println(" , which belongs to " + truckName + ".");
		System.out.println(truckName + " specializes in cooking " + truckType + ".");
		System.out.println("The truck identification number for " + truckName + " is " + truckID + ".");
		
	}
	

}
