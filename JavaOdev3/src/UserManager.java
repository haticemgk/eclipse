
public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getUserName()+" "+ "Eklendi");
	}
	public void logIn(User user) {
		System.out.println(user.getUserName()+" "+user.getUserPassword()+" "+ "Kullan�c� ad� ve �ifresiyle giri� yap�ld�");
	

	}
}
