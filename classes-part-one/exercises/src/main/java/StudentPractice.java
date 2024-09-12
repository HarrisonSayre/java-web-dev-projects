import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args) {
        //insantiate your Student class below
        Student student1 = new Student("Harrison Sayre", 42424242, 1, 4.0);
        ArrayList<Student> studentList1 = new ArrayList<>();
        studentList1.add(student1);
        Course course1 = new Course("WebDev", "Comp Sci", "Myself", 101, studentList1);
        Teacher teacher1 = new Teacher("A", "B", "C", 1);
        //System.out.println(student1.getName());
        //System.out.println(course1.getCourseName());
        //System.out.println(teacher1.getFirstName());
    }
}