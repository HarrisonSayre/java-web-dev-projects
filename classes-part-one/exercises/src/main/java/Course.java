import java.util.ArrayList;

public class Course {
    private String courseName;
    private String department;
    private String teacher;
    private int courseNumber;
    private ArrayList<Student> studentList = new ArrayList<>();

    public Course(String courseName, String department, String teacher, int courseNumber, ArrayList<Student> studentList) {
        setCourseName(courseName);
        setDepartment(department);
        setTeacher(teacher);
        setCourseNumber(courseNumber);
        setStudentList(studentList);
    }

    private void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    private void setDepartment(String department) {
        this.department = department;
    }
    private void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    private void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }
    private void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public String getCourseName() {
        return courseName;
    }
    public String getDepartment() {
        return department;
    }
    public String getTeacher() {
        return teacher;
    }
    public int getCourseNumber() {
        return courseNumber;
    }
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

}