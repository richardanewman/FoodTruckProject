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
		String inputName;
		double inputRating;
		System.out.println("Welcome to Food Truck");

		while (count < 5) {
			newTruck = new FoodTruck();
			System.out.print("Please enter truck's name: ");
			inputName = kb.nextLine();

			System.out.print("Please enter truck's rating: ");
			inputRating = kb.nextDouble();
			kb.nextLine();
			
			newTruck.setName(inputName);
			newTruck.setRating(inputRating);
			newTruck.setNextId(count);
			addTruck(newTruck);

//			System.out.println(truckArr[0]);
//			System.out.println(truckArr[1]);
//			System.out.println(truckArr[2]);
//			System.out.println(truckArr[3]);
//			System.out.println(truckArr[4]);
			count++;

		}
		printTruckArr(getTrucks());
		kb.close();
	}

	private void addTruck(FoodTruck truck) {
		truckArr[index] = truck;
		index++;
	}

	private FoodTruck[] getTrucks() {
		FoodTruck[] copyTrucks = new FoodTruck[index];

		for (int i = 0; i <index; i++) {
			copyTrucks[i] = truckArr[i];
		}
		return copyTrucks;
	}
	
	private void printTruckArr(FoodTruck[] trucks) {
	    for (FoodTruck truck : trucks) {
	      truck.displayTrucks();
	    }
	  }
	
}
