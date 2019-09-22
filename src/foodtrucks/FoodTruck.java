package foodtrucks;

public class FoodTruck {

	private static int truckId = 1234;
	private int nextTruckId;
	private String name;
	private String type;
	private double rating;
	
	

	public FoodTruck() {
		super();
	}

	public FoodTruck(String name, String type, double rating) {
		super();
		this.name = name;
		this.type = type;
		this.rating = rating;
		
	}

	public int getNextId() {
		return nextTruckId;
		
	}

	public void setNextId() {
		this.nextTruckId = FoodTruck.truckId++;
		
		

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nFoodTruck [ID=");
		builder.append(nextTruckId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", type=");
		builder.append(type);
		builder.append(", rating=");
		builder.append(rating);
		builder.append("]\n");
		return builder.toString();
	}
	public void displayTrucks() {
	    String trucks = this.toString();
	    System.out.println(trucks);
	  }
	

	

}
