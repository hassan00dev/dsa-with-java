package algorithms.problems;

public class Factorial {

    public static long factorial(int n){

        if(n <= 0){
            System.out.println("Provide a positive number.");
            return 0;
        }else if(n == 1){
            return 1;
        }

        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(9));
    }
}
