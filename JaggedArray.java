public class JaggedArray {
    public static void main(String[] args) {
        // Declaring an array with 3 rows, but column sizes are not fixed yet
        int[][] jArray = new int[3][];

        // Assigning different column lengths for each row
        jArray[0] = new int[3]; // row 0 has 3 columns
        jArray[1] = new int[5]; // row 1 has 5 columns
        jArray[2] = new int[2]; // row 2 has 2 columns

        // Assigning values
        jArray[0][0] = 1;
        jArray[1][2] = 7;
        jArray[2][1] = 9;

        // Printing the jagged array
        for (int i = 0; i < jArray.length; i++) {
            for (int j = 0; j < jArray[i].length; j++) {
                System.out.print(jArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// Output
/*
1 0 0 
0 0 7 0 0 
0 9 
 */