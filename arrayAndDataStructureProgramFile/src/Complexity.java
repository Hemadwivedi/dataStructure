public class Complexity {

    /**
     * O(n^2)
     * {10, 5, 7, 9, 1}
     * 10 => {10, }
     * @param inputArray
     */
    public static void quadratic(int inputArray[]) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i; j < inputArray.length; j++) {
                if (inputArray[i] > inputArray[j]) {
                    int a = inputArray[i];
                    int b = inputArray[j];
                    inputArray[i] = b;
                    inputArray[j] = a;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{10, 5, 7, 9, 1};
        quadratic(a);
        for (int x : a) {
            System.out.print(x + ", ");
        }
    }
}
