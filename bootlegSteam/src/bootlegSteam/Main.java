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

		// Customer Bilgi (Ge�ersiz Kullan�c�)
		customer.setDateOfBirth(LocalDate.of(1993, 7, 15));
		customer.setFirstName("Ahmet");
		customer.setLastName("Kurt");
		customer.setNationalId("68795459215");

		// Customer Kay�t
		customerManager.signUp(customer, new MernisAdapter());
		customerManager.logIn(customer);
		customerManager.logOut(customer);

		// Oyun Sat��
		MarketManager.buy(customer, games[1]);

		// Kampanya Tan�mlama
		Campaign yeniYil = new Campaign("YeniY�l", 20, games);
		campaignManager.addCampaign(yeniYil);

		// Yeni fiyatlar� yazd�ral�m
		for (Product game : games) {
			System.out.println(game.getFinalPrice() + " TL ");
		}

		// Kampanyaya dahil oyun sat���
		MarketManager.buy(customer, games[1]);

	}

}
