package StudentGradeCalculator;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            totalMarks += scanner.nextInt();
        }

        double percentage = (double) totalMarks / subjects;
        char grade;

        if (percentage >= 90) grade = 'A';
        else if (percentage >= 80) grade = 'B';
        else if (percentage >= 70) grade = 'C';
        else if (percentage >= 60) grade = 'D';
        else grade = 'F';

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
