import java.util.ArrayList;
import java.util.List;

public class MaxSumPath {
    
    // Function to find the maximum sum path and print it
    public static int findMaxSumPath(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int i = 0, j = 0; // Pointers for X and Y arrays
        int sumX = 0, sumY = 0; // Initialize sums of current paths

        int maxSum = 0; // Initialize maximum sum
        List<Integer> path = new ArrayList<>(); // Store the maximum sum path

        // Loop until we reach the end of both arrays
        while (i < m && j < n) {
            // If current element of X is smaller, add it to sumX
            if (X[i] < Y[j]) {
                sumX += X[i++];
            }
            // If current element of Y is smaller, add it to sumY
            else if (X[i] > Y[j]) {
                sumY += Y[j++];
            }
            // If we reach a common element, choose the maximum sum path and reset sums
            else {
                maxSum += Math.max(sumX, sumY) + X[i]; // Choose the maximum sum path and add current common element
                path.add(X[i]); // Add common element to path
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }

        // Add remaining elements of X[]
        while (i < m) {
            sumX += X[i++];
        }
        // Add remaining elements of Y[]
        while (j < n) {
            sumY += Y[j++];
        }

        // Choose the maximum sum path and add the last common element if exists
        maxSum += Math.max(sumX, sumY);
        path.add(maxSum); // Add the last element of the path, which is the maximum sum
        
        // Print the maximum sum path
        System.out.print("The maximum sum path is: ");
        for (int k = 0; k < path.size() - 1; k++) {
            System.out.print(path.get(k) + " —> ");
        }
        System.out.println(path.get(path.size() - 1));
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

        int maxSum = findMaxSumPath(X, Y);
        System.out.println("The maximum sum is: " + maxSum);
    }
}
