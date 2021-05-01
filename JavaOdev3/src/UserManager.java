
public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getUserName()+" "+ "Eklendi");
	}
	public void logIn(User user) {
		System.out.println(user.getUserName()+" "+user.getUserPassword()+" "+ "Kullanýcý adý ve þifresiyle giriþ yapýldý");
	

	}
}
