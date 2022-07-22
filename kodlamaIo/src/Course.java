public class Course {
    private int courseId;
    private String courseName;
    private String courseDetail;

    public Course() {
    }

    public Course(int courseId, String courseName, String courseDetail) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDetail = courseDetail;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDetail() {
        return courseDetail;
    }

    public void setCourseDetail(String courseDetail) {
        this.courseDetail = courseDetail;
    }
}
