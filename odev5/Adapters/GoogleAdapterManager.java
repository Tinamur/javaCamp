package odev5.Adapters;

import odev5.business.abstracts.LogInService;
import odev5.googleServices.GoogleLogIn;

public class GoogleAdapterManager implements LogInService{
	
	// Google 'a �zel oldu�u i�in bu �ekilde tam ba��ml� yapt�m
	GoogleLogIn logIn = new GoogleLogIn();

	@Override
	public void checkEmailAndPassword(String email, String password) {
		
		logIn.senKimsinDeGoogleAYolVermiyorsunAkliniAlirimSeninGoogleimLaBen(email,password);
		
	}

}
