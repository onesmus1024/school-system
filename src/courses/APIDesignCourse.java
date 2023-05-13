package courses;



import java.time.LocalDate;
import java.time.Period;
import school.*;

public class APIDesignCourse extends Course {
    public APIDesignCourse(int courseSize, Teacher teacher) {
        super(courseSize, teacher);
    }

    public String getName() {
        return getTeacher().getName() + "'s API Design Course";
    }

    LocalDate courseStart = LocalDate.of(2021, 3, 15);
    LocalDate courseEnd = LocalDate.of(2021, 3, 29);
    Period p = Period.between(courseStart, courseEnd);

    public int getDuration() {
        return p.getDays();
    }

    public LocalDate getCourseStart() {
        return courseStart;
    }
}
