package algorithms.problems;

public class Prime {

    static boolean isPrime(int n, int i)
    {
        if (n <= 2)
            return true;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrime(n, i + 1);
    }

    public static boolean isPrime2(int n, int d) {
        if (n <= 1) {
            return false;
        } else if (d > n / 2) {
            return true;
        } else if (n % d == 0) {
            return false;
        }
        return isPrime(d + 1, n);
    }// isPrime

    public static void main(String[] args)
    {
        int n = 2;

        if (isPrime2(n, 2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}