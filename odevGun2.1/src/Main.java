
public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor(1,"Engin Demirog");
		Instructor instructor2 = new Instructor(2,"Murat Yucedag");
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addInstructor(instructor1);
		instructorManager.addInstructor(instructor2);
				
		Course course1 = new Course(1, "Java",instructor1.instructorName);
		Course course2 = new Course(2, "C#", instructor2.instructorName);

		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		System.out.println("**********************");
		Course[] courses = { course1, course2 };
		for (Course course : courses) {
			System.out.println(course.courseName + "-" + course.instructorName);
		}
		System.out.println("**********************");
		courseManager.deleteCourse(course1);
		courseManager.deleteCourse(course2);
		instructorManager.deleteInstructor(instructor1);
		instructorManager.deleteInstructor(instructor2);

	}

}
