import java.util.Scanner;

public class GradeCalculator {

    // Method to get the student's score from the user
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score;

        // Prompt the user for their score
        System.out.print("Enter your score: ");
        
        // Check if the input is a valid number
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Discard invalid input
            System.out.print("Enter your score: ");
        }

        score = scanner.nextDouble();
        return score;
    }

    // Method to calculate the grade based on the score
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Main method to drive the program flow
    public static void main(String[] args) {
        // Get the student's score from the user
        double score = getStudentScore();

        // Calculate the grade based on the score
        String grade = calculateGrade(score);

        // Output the grade
        System.out.println("Your Grade is: " + grade);
    }
}
