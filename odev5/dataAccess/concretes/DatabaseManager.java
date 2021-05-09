package odev5.dataAccess.concretes;

import odev5.dataAccess.abstracts.DatabaseService;
import odev5.entities.concretes.BasicUser;
import odev5.fakeDatabase.FakeDatabase;

public class DatabaseManager implements DatabaseService{

	@Override
	public void addtoDatabase(BasicUser user) {
		FakeDatabase.addUsers(user);
		
	}

	@Override
	public boolean checkDatabaseForEmail(String email) {
		for (BasicUser user : FakeDatabase.getUsers()) {
			if (user.getEmail() == email) {
				System.out.println("Bu email Kullan�lmaktad�r!");
				return false;
			}
		}
		return true;
			
	}

	@Override
	public void removeFromDatabase(BasicUser user) {
		// TODO Auto-generated method stub
		
	}

}
