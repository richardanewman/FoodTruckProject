package foodtrucks;

public class FoodTruck {
	
	private int uniqueId = 0;
	private String name;
	private double rating;
	
	public FoodTruck() {
		super();
	}
	
	public FoodTruck(String name, double rating) {
		super();
		this.name = name;
		this.rating = rating;
		this.uniqueId = setUniqueId();
	}
	
	public int getUniqueId() {
		return uniqueId;
	}
	
	public int setUniqueId() {
		this.uniqueId = uniqueId++;
		return uniqueId;
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
		builder.append("FoodTruck [name=");
		builder.append(name);
		builder.append(", rating=");
		builder.append(rating);
		builder.append("]");
		return builder.toString();
	}
	

}
