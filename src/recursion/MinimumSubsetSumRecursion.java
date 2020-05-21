package recursion;

public class MinimumSubsetSumRecursion {
    public static void main(String[] args) {
        int a[] = new int [] {1, 2, 7};
        System.out.println("Minimum subset sum: " + minSum(a, a.length - 1, 0, 0));
    }

    private static int minSum(int[] a, int n, int s1, int s2) {
        if (n < 0)
            return Math.abs(s1 - s2);
        int inc = minSum(a, n - 1, s1 + a[n], s2);

        int exc = minSum(a, n - 1, s1, s2 + a[n]);
        return Integer.min(inc, exc);
    }
}
