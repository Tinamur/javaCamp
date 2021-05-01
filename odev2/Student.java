package odev2;

public class Student extends User{
	
//	Instructorda olmayýp Student da olan birsey bulamadým, 
//	böyle birsey koyalým.
	
	private double courseCompletion;
	
	public Student() {
			
		}
	
	public Student(int id, String picture, String firstName,
			String lastName, String email, String password,
			String currentCourse, double courseCompletion) {
		
		super(id, picture, firstName, lastName, email, password, currentCourse);
		this.courseCompletion = courseCompletion;
		
	}

	public double getCourseCompletion() {
		return courseCompletion;
	}

	public void setCourseCompletion(float courseCompletion) {
		this.courseCompletion = courseCompletion;
	}
	

}
