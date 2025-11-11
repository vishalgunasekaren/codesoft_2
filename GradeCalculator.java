import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks obtained in each subject (out of 100):");

        System.out.print("English: ");
        int english = scanner.nextInt();

        System.out.print("Tamil: ");
        int tamil = scanner.nextInt();

        System.out.print("Maths: ");
        int maths = scanner.nextInt();

        System.out.print("Science: ");
        int science = scanner.nextInt();

        System.out.print("Social Science: ");
        int socialScience = scanner.nextInt();

        // Calculate total marks
        int totalMarks = english + tamil + maths + science + socialScience;

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / 5;

        // Assign grades based on the average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

