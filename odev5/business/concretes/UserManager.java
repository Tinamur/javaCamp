package odev5.business.concretes;

import odev5.business.abstracts.SignUpService;
import odev5.business.abstracts.UserService;
import odev5.dataAccess.concretes.DatabaseManager;
import odev5.entities.concretes.BasicUser;

public class UserManager implements UserService{
	
	SignUpService signUpService = new BaseSignUpManager(); // Hatal� bir Kullan�m!
	DatabaseManager databaseManager = new DatabaseManager();// �OOOOK hatal�

	@Override
	public void singUp(BasicUser user) {
		if (	signUpService.validateFirstName(user.getFirstName()) &&
				signUpService.validateLastName(user.getLastName()) &&
				signUpService.validatePassword(user.getPassword()) &&
				signUpService.validateEmail(user.getEmail()) && 
				databaseManager.checkDatabaseForEmail(user.getEmail())) {
			databaseManager.addtoDatabase(user);
			System.out.println("Kay�t edildi");
		}else {
			System.out.println("Bir yerde hata oldu");
		}
		
	}

	@Override
	public void logIn(BasicUser user) {
		// TODO Auto-generated method stub
		
	}

}
