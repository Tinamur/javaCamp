package bootlegSteam.CheckerTypes;

import bootlegSteam.Abstract.CustomerCheckService;
import bootlegSteam.UserTypes.Customer;

public class FakeChecker implements CustomerCheckService{

	@Override
	public boolean checkRealPerson(Customer customer) {
		return true;
	}

}
