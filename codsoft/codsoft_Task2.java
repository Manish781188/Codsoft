  
//<-------------------------------STUDENT  GRADE CALCULATION----------------------------------->

import java.util.Scanner;

public class codsoft_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        
        // Array to store marks
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;
        
        // Input marks for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        
        // Calculate average percentage
        float averagePercentage = (float) totalMarks / numberOfSubjects;

        // Determine grade
        String grade;
        if (averagePercentage >= 91 && averagePercentage<=100) {
            grade = "A+";
        } else if (averagePercentage >= 81 && averagePercentage<=90) {
            grade = "A";
        } else if (averagePercentage >= 71 && averagePercentage<=80) {
            grade ="B";
        } else if (averagePercentage >= 61 && averagePercentage<=70) {
            grade ="C";
        } else if (averagePercentage >= 51 && averagePercentage<=60) {
            grade = "D";
        }else {
            grade ="F";
        }

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: "+ averagePercentage+"%");
        System.out.println("Grade: " + grade);
        
      
    }
}
