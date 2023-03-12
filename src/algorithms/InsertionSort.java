package algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{3,1, 9, 10, 2, 6, 5};

        sort(a);
        printArray(a);
    }

    /**
     * https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/visualize/
     * Move from unsorted part (right side) to sorted part (left side)
     *
     * @param arr
     */
    private static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current > arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
    }

    public static void printArray(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
