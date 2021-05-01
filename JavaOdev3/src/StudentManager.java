
public class StudentManager extends UserManager {
	
	public void add(User user) {
		System.out.println(user.getId()+ " "+user.getFirstName()+" "+user.getLastName()+
				" "+ user.getEmail()+" "+user.getLessonName() + " "+"Öðrenci eklendi");
	}
	public void upDate(User user) {
		System.out.println(user.getId()+ " "+user.getFirstName()+" "+user.getLastName()+
				" "+ user.getEmail()+" "+user.getLessonName() + " "+"Öðrenci güncellendi");
	}
	
	
}
