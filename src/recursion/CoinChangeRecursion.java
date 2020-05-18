package recursion;

public class CoinChangeRecursion {
    public static void main(String[] args) {
        int a[] = new int[] {1, 2, 3};
        int sum = 5;
        System.out.println(totalWays(a, a.length, sum));
    }

    private static int totalWays(int[] a, int n, int sum) {
        if (sum == 0)
            return 1;
        else if (n == 0 && sum != 0)
            return 0;
        else if (a[n - 1] <= sum)
            return (totalWays(a, n, sum - a[n - 1]) + totalWays(a, n - 1, sum));
        return totalWays(a, n - 1, sum);
    }
}
