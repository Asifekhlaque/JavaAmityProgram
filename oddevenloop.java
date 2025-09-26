import java.util.Scanner;

public class oddevenloop {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        System.out.println("Odd numbers are: ");
        for (int i = 1; i < num; i=i+2) {
            System.out.println(i);
        }
        System.out.println("Even numbers in while loop: ");
        while (num > 0) {
            
            if(num%2==0){
                System.out.println(num);
            }
            num--;
        }
        
        sc.close();
    }
}