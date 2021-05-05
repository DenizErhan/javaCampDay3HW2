package dayThreeHW;

public class Main {

	public static void main(String[] args) {
		Student s1=new Student(1,"Deniz Erhan","feedthepony","1234","Java");
		Student s2=new Student(2,"Asrın Cesur","feedthepony's","4321","Java");
		
		Student [] students= {s1,s2};
		
		Instructor i1=new Instructor(1,"Engin Demiroğ","Masteructor","7654", students,"Java");
		
		StudentManager studentManager=new StudentManager();
		InstructorManager instructorManager=new InstructorManager();
		
		studentManager.signUp(s1);
		studentManager.signIn(s2);
		studentManager.changeUserName(s2, "PonyS");
		studentManager.changePwd(s1, "1357");
		studentManager.completeALesson(s1);
		studentManager.showActiveCourse(s2);
		
		instructorManager.signIn(i1);
		instructorManager.listStudents(i1);
		
	}

}
