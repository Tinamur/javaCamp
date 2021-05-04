package canliYayinOdev;

import java.time.LocalDate;

import canliYayinOdev.Abstract.BaseCustomerManager;
import canliYayinOdev.Adapters.MernisServiceAdapter;
import canliYayinOdev.Concrete.StarbucsCustomerManager;
import canliYayinOdev.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucsCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setDateOfBirth(LocalDate.of(1992, 5, 24));
		customer.setFirstName("Ahmet");
		customer.setLastName("Kurt");
		customer.setNationalityId("12345678901");
		
		customerManager.save(customer);
		

	}

}
