
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(987);
		student.setFirstName("Hatice");
		student.setLastName("Ersoy");
		student.setEmail("haticeersoy@gmail.com");
		student.setLessonName("Java");
				
		Instructor �nstructor = new Instructor();
		�nstructor.setId(1);
		�nstructor.setFirstName("Engin");
		�nstructor.setLastName("Demiro�");
		�nstructor.setLessonName("Java");
		
		User user= new User();
		user.setUserName("sall�yorum");
		user.setUserPassword("9999");
		
		
		UserManager userManager = new UserManager();
		userManager.logIn(user);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.upDate(student);
		
		InstructorManager �nstructorManager = new InstructorManager();
		�nstructorManager.add(�nstructor);
		
		
		
		
		

	}

}
