import com.oracle.webservices.internal.api.databinding.DatabindingMode;

public class Course {
    private String courseName ;
    private Integer courseId;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Course(String courseName, Integer courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
    }
}
