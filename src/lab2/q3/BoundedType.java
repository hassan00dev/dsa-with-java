package lab2.q3;

public class BoundedType
{
    public static void main(String[] args) {
        largestValue(3, 43.0, 8.0);
    }
    /**
     * Print the largest number within three numbers
     *
     * @param num1
     * @param num2
     * @param num3
     * @param <D>
     */
    public static <D extends Number> void largestValue(D num1, D num2, D num3){
        Double n1 = num1.doubleValue();
        Double n2 = num2.doubleValue();
        Double n3 = num3.doubleValue();
        if(n1 > n2 && n1 > n3){
            System.out.println(n1 + " is the largest number.");
        }else if(n2 > n1 && n2 > n3){
            System.out.println(n2 + " is the largest number.");
        }else {
            System.out.println(n3 + " is the largest number.");
        }
    }
}
