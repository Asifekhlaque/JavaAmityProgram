import java.util.Scanner;

public class primenum{
    public static void main(String[] args) {
        var num=0;
        boolean isPrime=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();

        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
        sc.close();

    }
}