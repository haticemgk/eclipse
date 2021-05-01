
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(987);
		student.setFirstName("Hatice");
		student.setLastName("Ersoy");
		student.setEmail("haticeersoy@gmail.com");
		student.setLessonName("Java");
				
		Instructor ınstructor = new Instructor();
		ınstructor.setId(1);
		ınstructor.setFirstName("Engin");
		ınstructor.setLastName("Demiroğ");
		ınstructor.setLessonName("Java");
		
		User user= new User();
		user.setUserName("sallıyorum");
		user.setUserPassword("9999");
		
		
		UserManager userManager = new UserManager();
		userManager.logIn(user);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.upDate(student);
		
		InstructorManager ınstructorManager = new InstructorManager();
		ınstructorManager.add(ınstructor);
		
		
		
		
		

	}

}
