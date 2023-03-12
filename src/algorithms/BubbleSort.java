package algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{3,1, 9, 10, 2, 6, 5};

        sort(a);
        printArray(a);
    }

    /**
     * https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/
     *
     * Fixed the positions from last
     * Right to Left
     * @param arr
     */
    private static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) { // n-1
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j+ 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArray(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
