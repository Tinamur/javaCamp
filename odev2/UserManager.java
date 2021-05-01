package odev2;

public class UserManager {
	
	public void listInformation(User user) {
		System.out.println(user.getId());
		System.out.println(user.getPicture());
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println(user.getCurrentCourse());
	}
	
	public void updateInformation() {
		System.out.println("Bilgileriniz Güncellenmiþtir");
	}

}
