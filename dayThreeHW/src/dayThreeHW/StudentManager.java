package dayThreeHW;

public class StudentManager extends UserManager{
	public void signIn(User user) {
		System.out.println("Student "+user.getUserName()+" is back!");
	}
	
	public void completeALesson(Student student) {
		student.setProgress(student.getProgress()+10);
		System.out.println("Your new progress is:%"+student.getProgress());
	}
	
	public void showActiveCourse(Student student) {
		System.out.println("You are a participant in "+student.getCourse()+
				" course.");
	}
}
