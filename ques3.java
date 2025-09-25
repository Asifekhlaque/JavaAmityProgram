// Write a java program to calculate the persentage obtain in five subject by five student . if  the persentage is grater than 80% give a bonus marks of 10 else if it is greater than 75% and less 5 marks is added to the student otherwise no bonus marks

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = 5;
        int subjects = 5;

        for (int i = 1; i <= students; i++) {
            int total = 0;
            System.out.println("\nEnter marks for Student " + i + ":");
            for (int j = 1; j <= subjects; j++) {
                System.out.print("Subject " + j + ": ");
                int marks = sc.nextInt();
                total += marks;
            }

            double percentage = (total / (subjects * 100.0)) * 100; // out of 100
            int bonus = 0;

            if (percentage >= 80) {
                bonus = 10;
            } else if (percentage >= 75) {
                bonus = 5;
            }

            int finalMarks = total + bonus;

            System.out.println("Student " + i + " Total Marks: " + total);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Bonus Marks: " + bonus);
            System.out.println("Final Marks (with bonus): " + finalMarks);
        }

        sc.close();
    }
}