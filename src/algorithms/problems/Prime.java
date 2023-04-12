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

    public static void main(String[] args)
    {

        int n = 7;

        if (isPrime(n, 2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}