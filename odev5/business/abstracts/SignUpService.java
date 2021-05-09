package odev5.business.abstracts;

public interface SignUpService {
	boolean  validateEmail(String Email);
	boolean validatePassword(String password);
	boolean validateFirstName(String name);
	boolean validateLastName(String lastName);
}
