package bootlegSteam;

import java.time.LocalDate;

import bootlegSteam.CheckerTypes.MernisAdapter;
import bootlegSteam.ProductTypes.Product;
import bootlegSteam.Services.CampaignManager;
import bootlegSteam.Services.CustomerManager;
import bootlegSteam.Services.MarketManager;
import bootlegSteam.UserTypes.Customer;

public class Main {

	public static void main(String[] args) {

		Product[] games = { new Product(1, 35, "Game1", 0), new Product(2, 100, "Game2", 0),

		};

		CustomerManager customerManager = new CustomerManager();
		Customer customer = new Customer();

		CampaignManager campaignManager = new CampaignManager();

		// Customer Bilgi (Geçersiz Kullanýcý)
		customer.setDateOfBirth(LocalDate.of(1993, 7, 15));
		customer.setFirstName("Ahmet");
		customer.setLastName("Kurt");
		customer.setNationalId("68795459215");

		// Customer Kayýt
		customerManager.signUp(customer, new MernisAdapter());
		customerManager.logIn(customer);
		customerManager.logOut(customer);

		// Oyun Satýþ
		MarketManager.buy(customer, games[1]);

		// Kampanya Tanýmlama
		Campaign yeniYil = new Campaign("YeniYýl", 20, games);
		campaignManager.addCampaign(yeniYil);

		// Yeni fiyatlarý yazdýralým
		for (Product game : games) {
			System.out.println(game.getFinalPrice() + " TL ");
		}

		// Kampanyaya dahil oyun satýþý
		MarketManager.buy(customer, games[1]);

	}

}
