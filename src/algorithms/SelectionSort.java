package algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = new int[]{3,1, 9, 10, 2, 6, 5};

        sort(a);
        printArray(a);
    }

    /**
     * Avoid unnecessary swapping
     * @param arr
     */
    private static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) { // n-1
            int smallestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[smallestIndex] > arr[j]){
                    smallestIndex = j;
                }
            }
            swap(arr, smallestIndex, i);
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
