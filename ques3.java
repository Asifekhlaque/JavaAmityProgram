
// Write a program to enter the name and marks of 5 students. If the marks are less than 80 and greater than 75, increase it by 10. If the marks are greater than 80, increase it by 5.
import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        int marks[] = new int[5];
        String stuname;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        stuname = sc.next();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the marks");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            temp = marks[i];
            if (temp < 80 && temp > 75) {

                System.out.println("Marks < 80 && Marks > 75 : " + temp);
                temp = temp + 10;
                marks[i] = temp;
            }
            if (temp > 80) {
                temp = temp + 5;
                if (temp > 100) {
                    temp = 100;
                    marks[i] = temp;
                } else {
                    
                    marks[i] = temp;
                }
                System.out.println("Marks >80 : " + temp);

            }
        }
        System.out.println("Name : " + stuname);
        System.out.println("New Marks");
        for (int j = 0; j < 5; j++) {
            System.out.println(marks[j]);
        }
        sc.close();
    }
}
