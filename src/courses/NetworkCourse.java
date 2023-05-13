package courses;

import java.time.LocalDate;
import java.time.Period;
import school.Course;
import school.Teacher;

public class NetworkCourse extends Course {
    public NetworkCourse(int courseSize, Teacher teacher) {
        super(courseSize, teacher);
    }

    public String getName() {
        return getTeacher().getName() + "'s Network Course";
    }

    LocalDate courseStart = LocalDate.of(2020, 9, 9);
    LocalDate courseEnd = LocalDate.of(2020, 11, 1);
    Period p = Period.between(courseStart, courseEnd);

    public int getDuration() {
        return p.getDays();
    }

    public LocalDate getCourseStart() {
        return courseStart;
    }
}