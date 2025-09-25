// Write a program java for 3 number if 2number are equal the enter new number
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter the number 2: ");
        num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("The number are not unique \nEnter new numbers");
            System.out.println("Enter the number 2: ");
            num2 = sc.nextInt();

        }
        System.out.println("Enter the number 3: ");
        num3 = sc.nextInt();
        if (num2 == num3 || num3 == num1) {
            System.out.println("The number are not unique \nEnter new numbers");
            System.out.println("Enter the number 3: ");
            num3 = sc.nextInt();
        }
        System.out.println("The number are not unique so the new numbers are: ");
        System.out.println("Num1 is " + num1 + "\nNum2 is " + num2 + "\nNum3 is " + num3);
        sc.close();
    }
}
