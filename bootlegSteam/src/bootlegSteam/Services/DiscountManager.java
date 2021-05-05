package bootlegSteam.Services;

import bootlegSteam.ProductTypes.Product;

public class DiscountManager {
	public static void setDiscount(Product game, int discount) {
		if (0 <= discount && discount < 100 ) {
		game.setDiscountPercentage(discount);
		}else if (discount == 100) {
			System.out.println("Oyun Bedava Yapýldý!");
			game.setDiscountPercentage(discount);
		}else {
			System.out.println("Geçersiz Deðer Girildi!");
		}
	}
}
