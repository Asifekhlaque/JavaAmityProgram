// Write a program to display the even number series upto the given number.
import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        System.out.println("Even numbers are: ");
        for (int i = 1; i < num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}