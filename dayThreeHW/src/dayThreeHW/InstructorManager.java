package dayThreeHW;

public class InstructorManager extends UserManager{

	public void signIn(User user) {
		System.out.println("Instructor "+user.getUserName()+" is back!");
	}
	
	public void listStudents(Instructor instructor) {
		for (Student student : instructor.getMyStudents()) {
			System.out.println(student.getFullName());
		}
	}
}
