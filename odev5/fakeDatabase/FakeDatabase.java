package odev5.fakeDatabase;

import java.util.ArrayList;

import odev5.entities.concretes.BasicUser;

public class FakeDatabase {
	
	private static ArrayList<BasicUser> users = new ArrayList<BasicUser>();
	
	public static void addUsers(BasicUser user) {
		users.add(user);
		System.out.println("database a user attın");
	}

	public static ArrayList<BasicUser> getUsers() {
		return users;
	}

	public static void setUsers(ArrayList<BasicUser> users) {
		FakeDatabase.users = users;
	}
	
}
