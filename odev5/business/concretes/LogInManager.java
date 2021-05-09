package odev5.business.concretes;

import odev5.business.abstracts.LogInService;
import odev5.entities.concretes.BasicUser;
import odev5.fakeDatabase.FakeDatabase;

public class LogInManager implements LogInService{

	@Override
	public void checkEmailAndPassword(String email, String password) {
		
		//�� i�e if kullanma sebebim hata emailde mi yoksa �ifrede mi g�rmek i�in
		for (BasicUser user : FakeDatabase.getUsers()) {
			if (email == user.getEmail()) {
				if(password == user.getPassword()) {
					System.out.println("Giri� Ba�ar�l� : " + user.getFirstName());
					return;
				}else {
					System.out.println("Yanl�� �ifre!");
					return;
				}
			}
			
		}
		System.out.println("B�yle Bir Kullan�c� Bulunamad�!");
	}

}
