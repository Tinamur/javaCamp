package bootlegSteam.Services;

import bootlegSteam.Campaign;
import bootlegSteam.ProductTypes.Product;

public class CampaignManager {

	public void addCampaign(Campaign campaign) {

		System.out.println(campaign.getName() + " Kampanyam�z Ba�lam��t�r!! Se�ili oyunlarda % "
				+ campaign.getDiscountPercentage() + " �ndirim F�rsat�n� Ka��rmay�n ");
		for (Product game : campaign.getGames()) {
			DiscountManager.setDiscount(game, campaign.getDiscountPercentage());
		}

	}

	public void UpdateCampaign(Campaign campaign, String newName, int newDiscountPercentage) {

		campaign.setName(newName); // Update K�sm� Biraz Farkl� Olsun Diye
		for (Product game : campaign.getGames()) {
			DiscountManager.setDiscount(game, newDiscountPercentage);
		}
	}

	public void deleteCampaign(Campaign campaign) {

		System.out.println(campaign.getName() + " Kampanyas� Bitmi�tir Yararlanabilenlere Aferin!! ");
		for (Product game : campaign.getGames()) {
			DiscountManager.setDiscount(game, 0);
		}
	}

}
