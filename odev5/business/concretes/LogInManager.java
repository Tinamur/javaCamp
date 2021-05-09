package odev5.business.concretes;

import odev5.business.abstracts.LogInService;
import odev5.entities.concretes.BasicUser;
import odev5.fakeDatabase.FakeDatabase;

public class LogInManager implements LogInService{

	@Override
	public void checkEmailAndPassword(String email, String password) {
		
		//Ýç içe if kullanma sebebim hata emailde mi yoksa þifrede mi görmek için
		for (BasicUser user : FakeDatabase.getUsers()) {
			if (email == user.getEmail()) {
				if(password == user.getPassword()) {
					System.out.println("Giriþ Baþarýlý : " + user.getFirstName());
					return;
				}else {
					System.out.println("Yanlýþ Þifre!");
					return;
				}
			}
			
		}
		System.out.println("Böyle Bir Kullanýcý Bulunamadý!");
	}

}
