package dayThreeHW;

public class Instructor extends User{
	private Student [] myStudents;
	private String myLecture;
	
	public Instructor() {
		
	}

	public Instructor(int id, String fullName, String userName,
			String password,Student[] myStudents,String myLecture) {
		super(id, fullName, userName, password);
		this.myLecture=myLecture;
		this.myStudents = myStudents;
	}

	public Student[] getMyStudents() {
		return myStudents;
	}

	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}

	public String getMyLecture() {
		return myLecture;
	}

	public void setMyLecture(String myLecture) {
		this.myLecture = myLecture;
	}
}
