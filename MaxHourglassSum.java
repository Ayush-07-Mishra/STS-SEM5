import java.util.Scanner;

public class MaxHourglassSum {

    // Function to find the maximum hourglass sum in a matrix
    public static int findMaxSum(int[][] mat, int R, int C) {
        int max_sum = Integer.MIN_VALUE; // Initialize to the smallest possible value
        int sum;

        // Edge case: If the matrix is smaller than 3x3
        if (R < 3 || C < 3) {
            System.out.println("Not possible");
            return -1; // Return -1 if hourglass is not possible
        }
        
        // Traverse the matrix to find the maximum hourglass sum
        for (int i = 0; i < R - 2; i++) {
            for (int j = 0; j < C - 2; j++) {
                // Calculate the sum of the current hourglass
                sum = (mat[i][j] + mat[i][j + 1] + mat[i][j + 2])   // Top row
                    + (mat[i + 1][j + 1])                           // Middle element
                    + (mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2]); // Bottom row

                // Update the maximum hourglass sum
                max_sum = Math.max(max_sum, sum);
            }
        }

        return max_sum; // Return the maximum hourglass sum
    }

    // Main method to take input and execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of rows and columns
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] mat = new int[R][C];

        // Read the matrix elements from user input
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Get the maximum hourglass sum
        int res = findMaxSum(mat, R, C);
        
        // Print the result
        if (res != -1) {
            System.out.println("Maximum sum of hourglass = " + res);
        }
    }
}
