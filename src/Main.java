
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n================================");
            System.out.println("    STUDENT MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.println("--------------------------------");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\n===== ADD NEW STUDENT =====");

                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();

                    Course course = new Course(courseName);
                    Student student = new Student(id, name, age, course);

                    students.add(student);

                    System.out.println("\nStudent added successfully!");
                    break;

                case 2:
                    System.out.println("\n===== ALL STUDENTS =====");

                    if (students.isEmpty()) {
                        System.out.println("No students registered.");
                    } else {
                        for (Student s : students) {
                            s.displayInfo();
                            System.out.println("------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n===== SEARCH STUDENT =====");

                    System.out.print("Enter Student ID: ");
                    String searchId = scanner.nextLine();

                    boolean found = false;

                    for (Student s : students) {
                        if (s.getStudentId().equalsIgnoreCase(searchId)) {
                            s.displayInfo();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("\nThank you for using the system!");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
