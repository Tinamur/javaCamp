package odev5.business.concretes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import odev5.business.abstracts.SignUpService;

public class BaseSignUpManager implements SignUpService {

	@Override
	public boolean validateEmail(String Email) {
		
		//Regex Konusunu inceledim ama Bu regex'i ben yapmad�m.
		String emailRegex ="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?!-)(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(Email);
		
		if(matcher.matches()) {
			System.out.println("Email tipi uygun");
			return true;
			
		}else {
			System.out.println("L�tfen ge�erli bir email giriniz!");
			return false;
		}
			
	}

	@Override
	public boolean validatePassword(String password) {
		if (password.length() < 6) {

			System.out.println("Parola en az 6 karakter uzunlu�unda olmal�d�r!!");
			return false;
		} else {

			System.out.println("Parola Uygun");
			return true;

		}
	}

	@Override
	public boolean validateFirstName(String name) {
		
		if (name.length() < 2) {

			System.out.println("Ad�n�z en az 2 karakter uzunlu�unda olmal�d�r!!");
			return false;

		} else {

			System.out.println("Ad�n�z Uygun");
			return true;

		}
		
	}

	@Override
	public boolean validateLastName(String lastName) {
		
		if (lastName.length() < 2) {

			System.out.println("Soyad�n�z en az 2 karakter uzunlu�unda olmal�d�r!!");
			return false;

		} else {

			System.out.println("Soyad�n�z Uygun");
			return true;

		}
		
	}

}