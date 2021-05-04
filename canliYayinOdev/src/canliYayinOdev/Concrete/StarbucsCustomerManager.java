package canliYayinOdev.Concrete;

import canliYayinOdev.Abstract.BaseCustomerManager;
import canliYayinOdev.Abstract.CustomerCheckService;
import canliYayinOdev.Entities.Customer;

public class StarbucsCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucsCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Geçerli bir insan deðil");
		}
		
		
	}
	

}
