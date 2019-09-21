package foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {
	FoodTruck[] truckArr = new FoodTruck[5];

	public static void main(String[] args) {
		FoodTruckApp user = new FoodTruckApp();
		user.run();

	}

	private void run() {
		FoodTruck newTruck = new FoodTruck();
		int count = 0;

		Scanner kb = new Scanner(System.in);
		String inputName;
		double inputRating;

		System.out.println("Welcome to Food Truck");
		
		do {
		System.out.println("Please enter truck's name:");
		inputName = kb.next();
		System.out.println("Please enter truck's rating:");
		inputRating = kb.nextDouble();
		newTruck.setName(inputName);
		newTruck.setRating(inputRating);
		addTruck(newTruck);
		
		
		
		System.out.println(truckArr[0]);
		System.out.println(truckArr[1]);
		System.out.println(truckArr[2]);
		System.out.println(truckArr[3]);
		System.out.println(truckArr[4]);
		count++;
		
		} while (count < 5);
		kb.close();
	}

	public void addTruck(FoodTruck truck) {
		truckArr[truck.setUniqueId()] = truck;
		}

//	public FoodTruck[] getTrucks() {
//		FoodTruck[] copyTrucks = new FoodTruck[index];
//
//		for (int i = 0; i <index; i++) {
//			copyTrucks[i] = this.foodtruck[i];
//		}
//		return copyTrucks;
		
	}


