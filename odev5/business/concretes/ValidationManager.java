package odev5.business.concretes;

import odev5.business.abstracts.ValidationService;
import odev5.dataAccess.concretes.DatabaseManager;
import odev5.entities.concretes.BasicUser;

public class ValidationManager implements ValidationService{
	
	DatabaseManager databaseManager;
	
	public ValidationManager(DatabaseManager databaseManager) {
		this.databaseManager = databaseManager;
	}

	@Override
	public void sendValidation(BasicUser user) {
		
		System.out.println("E-postanýza Doðrulama Linki Gönderildi");
		
		
		//Buraya Kadar geldiyse email ile onaylama yapmasýný otomatik olarak yapýyorum
		//main fonksiyonu içerisinden de çaðrýlabilir.
		this.receiveValidation(user);
		
	}

	@Override
	public void receiveValidation(BasicUser user) {
		databaseManager.addtoDatabase(user);
		System.out.println("Kaydýnýz baþarý ile tamamlandý");
		
		
	}

}
