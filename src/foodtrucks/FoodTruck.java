package foodtrucks;

public class FoodTruck {

	private int nextTruckId = 0;
	private String name;
	private double rating;

	public FoodTruck() {
		super();
	}

	public FoodTruck(int count, String name, double rating) {
		super();
		this.nextTruckId = count;
		this.name = name;
		this.rating = rating;
		
	}

	public int getNextId() {
		return nextTruckId;
		
	}

	public void setNextId(int count) {
		this.nextTruckId = count;
		

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		builder.append("FoodTruck [ID=");
		builder.append(nextTruckId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", rating=");
		builder.append(rating);
		builder.append("]");
		return builder.toString();
	}
	public void displayTrucks() {
	    String trucks = this.toString();
	    System.out.println(trucks);
	  }

	

}
