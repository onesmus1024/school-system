package school;

import java.util.Arrays;

public class Register {
    private  Course[] courses;
    private Student[] students;

    public Register(Course[] courses) {
        this.courses = courses;

        int numOfStudents = 0;
        for(Course course : courses)
            numOfStudents += course.getStudents().length;

        students = new Student[numOfStudents];
    }

    public void register(Student... students) {
        if (isFull())
            throw new IllegalArgumentException("Course is full");

        for (Student student : students) {
            if (Arrays.asList(this.students).contains(student)) {
                throw new IllegalArgumentException("You cannot add the same student twice");
            }
            for(Course course : courses) {
                if(student.prefersCourse(course) && !course.isFull())
                    student.assignCourse(course);
            }
            student.setRegister(this);
            for (int i = 0; i < this.students.length; i++) {
                if (this.students[i] == null) {
                    this.students[i] = student;
                    break;
                }
            }
        }
    }

    public boolean isFull() {
        boolean full = true;
        for (Student student : students)
            if (student == null)
                return full = false;
            return full;
    }

    public Student[] getStudents() {
        return Arrays.copyOf(students, students.length);
    }

    public  Course[] getCourses() {
        return  Arrays.copyOf(courses, courses.length);
    }
}
