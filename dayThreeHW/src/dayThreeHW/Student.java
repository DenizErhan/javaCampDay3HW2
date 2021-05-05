package dayThreeHW;

public class Student extends User{
	private int progress=0;
	private String course;
	
	
	
	public Student() {

	}



	public Student(int id, String fullName, String userName,
			String password,String course) {
		super(id, fullName, userName, password);
		this.course=course;
	}



	public int getProgress() {
		return progress;
	}



	public void setProgress(int progress) {
		this.progress = progress;
	}



	public String getCourse() {
		return course;
	}



	public void setCourse(String course) {
		this.course = course;
	}

}
