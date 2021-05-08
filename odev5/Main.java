package odev5;

import odev5.business.abstracts.UserService;
import odev5.business.concretes.UserManager;
import odev5.entities.concretes.BasicUser;

public class Main {

	public static void main(String[] args) {
		UserService usermanager = new UserManager();
		BasicUser user = new BasicUser(0,"AB","AB","asd@gmail.co","123456");
		usermanager.singUp(user);
		
		

	}

}
