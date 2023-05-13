package school;

import java.util.*;

public class Student extends Entity{
	private School school;
	private Course[]courses;
    private Register register;
	private Set<Class<?extends Course>> preferredCourses;
	
	public Student(String name) {
		super(name);
		courses=new Course[2];
		preferredCourses=new HashSet<>();
	}
	
	public void setPreferredCourses(Class<?extends Course>...courses) {
		for(Class<?extends Course>course:courses) {
			preferredCourses.add(course);
		}
	}
	
	void assignCourse(Course course) {
		for(int i=0;i<courses.length;i++) {
			if(course==courses[i])
				continue;
			
			if(courses[i]==null) {
				course.addStudent(this);
				courses[i]=course;
				return;
			}
		}
	}
	
	void setSchool(School school) {
		this.school=school;
	}
	
	public School getSchool() {
		return school;
	}
	
	public Course[]getCourses(){
		return Arrays.copyOf(courses,courses.length);
	}
	
        public void setRegister(Register register) {
        this.register = register;
    }
	public boolean prefersCourse(Course course) {
		return preferredCourses.contains(course.getClass());
	}
	
	public boolean isTakingCourse(Course course) {
		boolean contains=false;
		for(Course c:courses)
			return contains=(c==course);
		
		return contains;
	}
}




