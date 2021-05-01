package odev2;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		Instructor engin = new Instructor();
		engin.setId(1);
		engin.setPicture("1. Hoca Resmi");
		engin.setFirstName("Engin");
		engin.setLastName("Demiro�");
		engin.setEmail("Ed@gmail.com");
		engin.setPassword("123456789");
		engin.setCurrentCourse("Java");
		engin.setPhoneNumber("537 456 98 98");
		engin.setSalary(999999);
		engin.setBankAccountNumber("TR 190 8894 4568 2135 1535 9875 65");
		

		
		
		Instructor ayse = new Instructor(
				2,
				"2. Hoca Resmi",
				"Ay�e",
				"Y�lmaz",
				"Ay@gmail.com",
				"987654321",
				"C#",
				"507 121 35 45",
				15000,
				"TR 1900 9488 6845 3521 3515 7598 56"
				);
		
		Student ahmet = new Student(
				3,
				"��renci Resmi",
				"Ahmet",
				"Kurt",
				"Ak@hotmail.com",
				"sifrem123",
				"Java",
				12.8
				);
		
		Student rumeysa = new Student(
				4,
				"��renci Resmi",
				"R�meysa",
				"Y�ld�z",
				"RY@hotmail.com",
				"�ifreyebakbe",
				"Java",
				11.4
				);
		
		
		userManager.listInformation(rumeysa);
		studentManager.postComment("Yorum Olarak dolsun buras�");
		instructorManager.addContent();
		
		

	}

}
