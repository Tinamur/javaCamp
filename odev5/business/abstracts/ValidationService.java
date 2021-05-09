package odev5.business.abstracts;

import odev5.entities.concretes.BasicUser;

public interface ValidationService {
	void sendValidation(BasicUser user);
	void receiveValidation(BasicUser user);
}
