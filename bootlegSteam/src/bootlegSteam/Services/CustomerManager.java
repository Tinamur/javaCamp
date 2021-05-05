package bootlegSteam.Services;

import bootlegSteam.Abstract.CustomerCheckService;
import bootlegSteam.UserTypes.Customer;

public class CustomerManager {

	public void signUp(Customer customer , CustomerCheckService checker) {
		
		if(checker.checkRealPerson(customer)) {
			System.out.println("Baþarýyla kayýt olundu!");
		}else {
			System.out.println("Bilgilerinizi Kontrol Ediniz");
		}
		
	}
	
	public void logIn(Customer customer) {
		System.out.println("Baþarý ile giriþ yapýdýðýný varsayalým : " + customer.getFirstName());
	}
	
	public void logOut(Customer customer) {
		System.out.println("Baþarý ile çýkýþ yapýdýðýný varsayalým : " + customer.getFirstName());
	}
	
	public void updateCustomer(Customer customer) {
		System.out.println("Bilgiler Güncellendi : " + customer.getFirstName());
	}
	
	
	

}
