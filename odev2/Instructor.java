package odev2;

public class Instructor extends User{
	private String phoneNumber;
	private double salary;
	private String bankAccountNumber;
	
	
	public Instructor() {

	}
	
	
	public Instructor(int id, String picture, String firstName,
			String lastName, String email, String password,
			String currentCourse, String phoneNumber,
			double salary, String bankAccountNumber) {
		
		super(id, picture, firstName, lastName, email, password, currentCourse);
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.bankAccountNumber = bankAccountNumber;
		
	}
	
	


	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

}
