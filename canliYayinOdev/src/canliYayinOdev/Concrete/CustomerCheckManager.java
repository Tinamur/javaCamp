package canliYayinOdev.Concrete;

import canliYayinOdev.Abstract.CustomerCheckService;
import canliYayinOdev.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}
