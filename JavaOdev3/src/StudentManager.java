
public class StudentManager extends UserManager {
	
	public void add(User user) {
		System.out.println(user.getId()+ " "+user.getFirstName()+" "+user.getLastName()+
				" "+ user.getEmail()+" "+user.getLessonName() + " "+"��renci eklendi");
	}
	public void upDate(User user) {
		System.out.println(user.getId()+ " "+user.getFirstName()+" "+user.getLastName()+
				" "+ user.getEmail()+" "+user.getLessonName() + " "+"��renci g�ncellendi");
	}
	
	
}
