
public class Student extends Person {

    private String studentId;
    private Course course;

    // Constructor
    public Student(String studentId, String name, int age, Course course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    // Getter for student ID
    public String getStudentId() {
        return studentId;
    }

    // Setter for student ID
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Getter for course
    public Course getCourse() {
        return course;
    }

    // Setter for course
    public void setCourse(Course course) {
        this.course = course;
    }

    // Overriding the parent class method
    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Course: " + course.getCourseName());
    }
}
