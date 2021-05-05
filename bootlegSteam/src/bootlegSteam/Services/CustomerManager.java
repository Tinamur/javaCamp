package bootlegSteam.Services;

import bootlegSteam.Abstract.CustomerCheckService;
import bootlegSteam.UserTypes.Customer;

public class CustomerManager {

	public void signUp(Customer customer , CustomerCheckService checker) {
		
		if(checker.checkRealPerson(customer)) {
			System.out.println("Ba�ar�yla kay�t olundu!");
		}else {
			System.out.println("Bilgilerinizi Kontrol Ediniz");
		}
		
	}
	
	public void logIn(Customer customer) {
		System.out.println("Ba�ar� ile giri� yap�d���n� varsayal�m : " + customer.getFirstName());
	}
	
	public void logOut(Customer customer) {
		System.out.println("Ba�ar� ile ��k�� yap�d���n� varsayal�m : " + customer.getFirstName());
	}
	
	public void updateCustomer(Customer customer) {
		System.out.println("Bilgiler G�ncellendi : " + customer.getFirstName());
	}
	
	
	

}
