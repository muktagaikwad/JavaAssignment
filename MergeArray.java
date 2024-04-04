public class MergeArray {
    
    // Function to merge Y[] into X[] in sorted order
    public static void mergeArray(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        // Move all elements of X to the end
        int lastIndex = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[lastIndex--] = X[i];
            }
        }

        // Merge X and Y
        int i = lastIndex + 1; // Start index of X
        int j = 0; // Start index of Y
        int k = 0; // Start index of merged array

        while (i < m && j < n) {
            if (X[i] <= Y[j]) {
                X[k++] = X[i++];
            } else {
                X[k++] = Y[j++];
            }
        }

        // If there are remaining elements in Y[]
        while (j < n) {
            X[k++] = Y[j++];
        }
    }

    // Utility function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        System.out.println("Input X[]: ");
        printArray(X);
        System.out.println("Input Y[]: ");
        printArray(Y);

        mergeArray(X, Y);

        System.out.println("Merged X[]: ");
        printArray(X);
    }
}
