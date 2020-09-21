import java.util.Arrays;

/**
 * O(1) => Constant time
 * O(Log N) = Logarithmic time
 * O(N) => Liner
 * O(N^2) => Quadratic
 */
public class BinarySearch {


    /**
     * O(N)
     */
    public static int search(int input, int inputArray[]) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == input) {
                return i;
            }
        }
        return -1;
    }

    /**
     * input array should always be sorted
     * <p>
     * log(n) => in every iteration we are dividing the problem set in half
     */
    public static int binarySearchRecursive(int a[], int low, int high, int key) {
        if (high < low) return -1; //  base case
        int mid = (high + low) / 2;
        if (a[mid] == key) {
            return mid;
        } else if (key < a[mid]) {
            return binarySearchRecursive(a, low, mid, key);
        } else {
            return binarySearchRecursive(a, mid + 1, high, key);
        }
    }

    /*
           loping
     */
    public static int binarySearchIterative(int a[], int low, int high, int key) {
        while (high >= low) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (key < a[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int searchDivideAndConcre(int input, int inputArray[]) {
        Arrays.sort(inputArray);
        return binarySearchIterative(inputArray, 0, inputArray.length - 1, input);
    }

    public static void main(String[] args) {
        int[] a = new int[]{10, 5, 7, 8, 20, 3};
        int index = searchDivideAndConcre(10, a);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found element at index " + index);
        }
    }
}
