package bootlegSteam.ProductTypes;

import bootlegSteam.Abstract.ProductInterface;

public class Product implements ProductInterface{
	
	private int id;
	private double unitPrice;
	private String name;
	private int discountPercentage = 0; //Default is 0
	

	public Product(int id, double unitPrice, String name, int discountPercentage) {
		this.id = id;
		this.unitPrice = unitPrice;
		this.name = name;
		this.discountPercentage = discountPercentage;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDiscountPercentage() {
		return discountPercentage;
	}


	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}


	@Override
	public double getFinalPrice() {
		return this.unitPrice - (this.unitPrice * this.discountPercentage / 100);
	}

}
