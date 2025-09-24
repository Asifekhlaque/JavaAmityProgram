// Write a program java for 3 number if 2number are equal the enter new number
public class ques1 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;
        int num3 = 2;

        if (num1 == num2 || num2 == num3 || num3 == num1) {
            if (num1 == num2) {
                num2 = num2 + 1;
            }
            if (num2 == num3 || num3 == num1) {
                num3 = num3 + 2;
            }
            System.out.println("The number are not unique so the new numbers are: ");
            System.out.println("Num1 is " + num1 + "\nNum2 is " + num2 + "\nNum3 is " + num3);
        } else {
            System.out.println("The numbers are unique: ");
            System.out.println("Num1 is " + num1 + "\nNum2 is " + num2 + "\nNum3 is " + num3);
        }
    }
}
