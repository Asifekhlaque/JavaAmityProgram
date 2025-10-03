public class pattent{
    public static void main(String[] args) {
        // Write a java program to print the following pattern using array
        int arr[][]={{1},{1,2},{1,2,3},{1,2,3,4}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        // Write a java program to print the following pattern using for loop
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}