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
		
		System.out.println("E-postan�za Do�rulama Linki G�nderildi");
		
		
		//Buraya Kadar geldiyse email ile onaylama yapmas�n� otomatik olarak yap�yorum
		//main fonksiyonu i�erisinden de �a�r�labilir.
		this.receiveValidation(user);
		
	}

	@Override
	public void receiveValidation(BasicUser user) {
		databaseManager.addtoDatabase(user);
		System.out.println("Kayd�n�z ba�ar� ile tamamland�");
		
		
	}

}
