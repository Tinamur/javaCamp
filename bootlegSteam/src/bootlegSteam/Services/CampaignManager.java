package bootlegSteam.Services;

import bootlegSteam.Campaign;
import bootlegSteam.ProductTypes.Product;

public class CampaignManager {

	public void addCampaign(Campaign campaign) {

		System.out.println(campaign.getName() + " Kampanyamýz Baþlamýþtýr!! Seçili oyunlarda % "
				+ campaign.getDiscountPercentage() + " Ýndirim Fýrsatýný Kaçýrmayýn ");
		for (Product game : campaign.getGames()) {
			DiscountManager.setDiscount(game, campaign.getDiscountPercentage());
		}

	}

	public void UpdateCampaign(Campaign campaign, String newName, int newDiscountPercentage) {

		campaign.setName(newName); // Update Kýsmý Biraz Farklý Olsun Diye
		for (Product game : campaign.getGames()) {
			DiscountManager.setDiscount(game, newDiscountPercentage);
		}
	}

	public void deleteCampaign(Campaign campaign) {

		System.out.println(campaign.getName() + " Kampanyasý Bitmiþtir Yararlanabilenlere Aferin!! ");
		for (Product game : campaign.getGames()) {
			DiscountManager.setDiscount(game, 0);
		}
	}

}
