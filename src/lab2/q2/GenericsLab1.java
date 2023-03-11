package lab2.q2;

public class GenericsLab1
{
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{2,3};
        String[] stringArray = new String[]{"hassan", "ali", "mohsin"};
        Double[] doubleArray = new Double[]{3.3, 7.2, 8.1, 2.9};
        printArray(intArray);
        printArray(stringArray);
        printArray(doubleArray);
    }

    public static <T> void printArray(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
