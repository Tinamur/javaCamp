package odev5;

import odev5.Adapters.GoogleAdapterManager;
import odev5.business.abstracts.LogInService;
import odev5.business.abstracts.UserService;
import odev5.business.concretes.BaseSignUpManager;
import odev5.business.concretes.LogInManager;
import odev5.business.concretes.UserManager;
import odev5.business.concretes.ValidationManager;
import odev5.dataAccess.concretes.DatabaseManager;
import odev5.entities.concretes.BasicUser;

public class Main {

	public static void main(String[] args) {
		
		UserService usermanager = new UserManager(
				new BaseSignUpManager(),
				new DatabaseManager(),
				new ValidationManager(new DatabaseManager()) 
				);
		
		LogInService googleLogIn = new GoogleAdapterManager();
		
		LogInService normalLogIn = new LogInManager();
		
		BasicUser user = new BasicUser(0,"Ahmet","Kurt","Ahmet@gmail.com","Ahmet123");
		BasicUser user2 = new BasicUser(1,"Mehmet","Yýlmaz","Mehmet@email.com","Memo321");
		usermanager.signUp(user);
		usermanager.signUp(user2);
		
		System.out.println("****************************");
		System.out.println("****************************");
		
		googleLogIn.checkEmailAndPassword("Google Ne Yazarsam Kabul Etmeye Programlý", "Bu Da þifre");
		System.out.println("****************************");
		
		normalLogIn.checkEmailAndPassword("asd@gmail.co", "123456");
		System.out.println("****************************");
		normalLogIn.checkEmailAndPassword("Ahmet@gmail.com", "Yanlýþ Þifre");
		System.out.println("****************************");
		normalLogIn.checkEmailAndPassword("Mehmet@email.com", "Memo321");
	}

}
