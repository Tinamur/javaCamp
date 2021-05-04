package canliYayinOdev.Adapters;

import java.rmi.RemoteException;

import canliYayinOdev.Abstract.CustomerCheckService;
import canliYayinOdev.Entities.Customer;
import mernisServiceReference.KPSPublicSoap;
import mernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		//
		//TRY VE CATCH ILE YAPILDI AMA ECLIPSE ONERDIGI ICIN BU KONUDA BIR BILGIM YOK
		//
		try {
			return client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear()
					);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	
}
