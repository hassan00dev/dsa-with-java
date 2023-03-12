package algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        // array must be sorted before applying binary search
        int[] a = new int[]{2, 3, 8, 9, 10, 12, 15};
        int key = 10;
        // System.out.println(search(a, key));
        System.out.println(recursiveBinarySearch(a, 0, a.length -1, key));
    }

    public static int search(int[] a, int key){
        int left = 0;
        int right = a.length - 1;
        int mid;
        int i = 0;

        while(left <= right){
            mid = left + (right - left) / 2;

            System.out.println("Left: " + left);
            System.out.println("Mid: " + mid);
            System.out.println("Right: " + right);
            System.out.println("----" + i++ + "----\n");

            if(a[mid] == key){
                return mid;
            }

            if(a[mid] < key){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int left, int right, int key){
        if(left <= right){
            int mid = left + (right - left) / 2;

            if (arr[mid] == key)
                return mid;

            if(arr[mid] < key){
                return recursiveBinarySearch(arr, mid + 1, right, key);
            }

            // arr[mid] > key
            return recursiveBinarySearch(arr, left, mid - 1, key);
        }
        return -1;
    }

    public static <T> void printArray(T a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }
}
