package bootlegSteam.CheckerTypes;

import java.rmi.RemoteException;

import bootlegSteam.Abstract.CustomerCheckService;
import bootlegSteam.UserTypes.Customer;
public class MernisAdapter implements CustomerCheckService{

	@Override
	public boolean checkRealPerson(Customer customer) {
		
		mernisClient.KPSPublicSoap client = new mernisClient.KPSPublicSoapProxy();
		
		try {	
			return client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear()
					);
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return false;

	}

}
