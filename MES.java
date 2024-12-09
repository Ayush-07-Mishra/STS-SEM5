public class MES {
    
    public static int getMaxEquilibriumSumOptimized(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        int maxSum = -1;  // Initialize maxSum to -1 to indicate no equilibrium point initially
        
        // Calculate the total sum of the array
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        // Traverse the array to check for equilibrium points
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];  // Update totalSum to represent the right sum

            // Check if leftSum equals totalSum (i.e., equilibrium point)
            if (leftSum == totalSum && leftSum > maxSum) {
                maxSum = leftSum;
            }

            // Update leftSum by adding the current element
            leftSum += arr[i];
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int maxSum = getMaxEquilibriumSumOptimized(arr);
        System.out.println("Max Equilibrium Sum : " + (maxSum != -1 ? maxSum : "No equilibrium sum"));
    }
}

