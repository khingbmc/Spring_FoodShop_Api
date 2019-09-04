package io.shop.springbootstarter.foodlist;

public class Food {

	private String id;
	private String foodname;
	private String description;
	
	
	public Food() {
		
	}
	
	public Food(String id, String foodname, String description) {
		super();
		this.id = id;
		this.foodname = foodname;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
