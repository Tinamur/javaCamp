package canliYayinOdev.Abstract;

import canliYayinOdev.Entities.Customer;

public abstract class BaseCustomerManager implements CustumerSevice{

	@Override
	public void save(Customer customer) {
		
		System.out.println("Saved to Database : " + customer.getFirstName());
		
	}

}
