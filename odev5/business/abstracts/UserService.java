package odev5.business.abstracts;

import odev5.entities.concretes.BasicUser;

public interface UserService {
	void signUp(BasicUser user);
	void logIn(BasicUser user);
}
