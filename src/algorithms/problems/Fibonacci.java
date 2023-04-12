package algorithms.problems;

public class Fibonacci {

    static void showFibonacci(int N)
    {
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is N
        while (counter < N) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static int fibRec(int n)
    {
        if (n <= 1)
            return n;

        return fibRec(n - 1)
                + fibRec(n - 2);
    }

    public static void fib(int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(fibRec(i) + " ");
        }
    }



    public static int fibSum(int n)
    {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibSum(n-1)+fibSum(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 8;
        fib(n);

        System.out.println();
        System.out.println("sum = " + fibSum(n));
    }
}
