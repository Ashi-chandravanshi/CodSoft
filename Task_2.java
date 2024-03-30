//STUDENT GRADE CALCULATOR

import java.util.Scanner;

public class Task_2 {
    public static void Calculate_grade(double avg){
        String grade;
        if(avg >= 95){
            grade = "A++";System.out.println("Grade - " + grade + "\nExcellent");
        } else if (avg >= 85) {
            grade = "A+"; System.out.println("Grade - " + grade + "\nBrilliant");
        } else if (avg >= 75) {
            grade = "A"; System.out.println("Grade - " + grade + "\nAwesome");
        } else if (avg >= 65) {
            grade = "B+";System.out.println("Grade - " + grade + "\nGood");
        } else if (avg >= 45) {
            grade = "B";System.out.println("Grade - " + grade + "\nSatisfactory");
        } else if (avg >= 33) {
            grade = "C";System.out.println("Grade - " + grade + "\nTry Hard!");
        }else{
            grade = "F";System.out.println("Grade - " + grade + "\nFAIL");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int n = sc.nextInt();
        int total_marks = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks obtained in subject "+ i + " out of 100: ");
            int marks = sc.nextInt();
            total_marks += marks;
        }
        double avg = (double)total_marks / n;
        System.out.println("You got total "+ total_marks +" marks out of 500 marks." );
        System.out.println("Average percentage is " + avg + ".");
        Calculate_grade(avg);


    }
}
