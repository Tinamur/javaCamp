package bootlegSteam.Services;

import bootlegSteam.ProductTypes.Product;
import bootlegSteam.UserTypes.Customer;

public class MarketManager {
	public static void buy(Customer customer, Product game) {

		System.out.println(customer.getFirstName() + " isimli kullanýcý " + game.getName() + " oyununu  "
				+ game.getFinalPrice() + " TL 'ye %" + game.getDiscountPercentage() + " indirim ile almýþtýr.");
	}
}
