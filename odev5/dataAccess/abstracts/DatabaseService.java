package odev5.dataAccess.abstracts;

import odev5.entities.concretes.BasicUser;

public interface DatabaseService {
	void addtoDatabase(BasicUser user);
	boolean checkDatabaseForEmail(String email);
	void removeFromDatabase(BasicUser user); // Bu Projede Kullanýlmayacak
}
