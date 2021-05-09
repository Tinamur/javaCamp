package odev5.business.concretes;

import odev5.business.abstracts.SignUpService;
import odev5.business.abstracts.UserService;
import odev5.business.abstracts.ValidationService;
import odev5.dataAccess.concretes.DatabaseManager;
import odev5.entities.concretes.BasicUser;

public class UserManager implements UserService {

	SignUpService signUpService;
	DatabaseManager databaseManager;
	ValidationService validationManager;

	public UserManager(SignUpService signUpService, DatabaseManager databaseManager, ValidationService validationManager) {
		super();
		this.signUpService = signUpService;
		this.databaseManager = databaseManager;
		this.validationManager = validationManager;
	}

	@Override
	public void signUp(BasicUser user) {

		if (signUpService.validateFirstName(user.getFirstName()) && signUpService.validateLastName(user.getLastName())
				&& signUpService.validatePassword(user.getPassword()) && signUpService.validateEmail(user.getEmail())
				&& databaseManager.checkDatabaseForEmail(user.getEmail())) {
			
			validationManager.sendValidation(user);

		} else {

			System.out.println("Bir yerde hata oldu");
			
		}

	}

	@Override
	public void logIn(BasicUser user) {
		// TODO Auto-generated method stub

	}

}
