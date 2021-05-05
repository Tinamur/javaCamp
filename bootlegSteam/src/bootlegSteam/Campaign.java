package bootlegSteam;

import bootlegSteam.ProductTypes.Product;

public class Campaign {
	private String name;
	private int discountPercentage;
	private Product[] games;
	
	public Campaign(String name, int discountPercentage, Product[] games) {
		this.name = name;
		this.discountPercentage = discountPercentage;
		this.games = games;
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

	public Product[] getGames() {
		return games;
	}

	public void setGames(Product[] games) {
		this.games = games;
	}
}
