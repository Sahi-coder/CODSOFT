package CourseManagementSystem;
import java.util.ArrayList;
import java.util.Scanner;

class Course {
    String code, title;
    
    Course(String code, String title) {
        this.code = code;
        this.title = title;
    }
}

public class CourseSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();
        
        courses.add(new Course("CS101", "Java Programming"));
        courses.add(new Course("CS102", "Data Structures"));

        while (true) {
            System.out.println("\n1. View Courses\n2. Register Course\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                for (Course c : courses) {
                    System.out.println(c.code + " - " + c.title);
                }
            } else if (choice == 2) {
                System.out.print("Enter course code to register: ");
                String code = scanner.next();
                System.out.println("Registered for " + code);
            } else break;
        }
        scanner.close();
    }
}
