package dayThreeHW;

public class UserManager {
	
	public void changeUserName(User user,String newUserName) {
		user.setUserName(newUserName);
		System.out.println("Username changed!");
		System.out.println("New username is:"+user.getUserName());
	}
	
	public void signUp(User user) {
		System.out.println(user.getUserName()+" signed up!");
	}
	
	public void signIn(User user) {
		System.out.println("User "+user.getUserName()+" is back!");
	}
	
	public void changePwd(User user,String newPassword) {
		user.setPassword(newPassword);
		System.out.println("Password changed!");
	}
}
