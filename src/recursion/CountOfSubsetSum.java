package recursion;

public class CountOfSubsetSum {
    public static void main(String[] args) {
        int a[] = {3, 1, 5, 9, 12, 8};
        int sum = 9;
        System.out.println(countSumOfSubset(a, a.length, sum));
    }

    private static int countSumOfSubset(int[] a, int n, int sum) {
        if (sum == 0)
            return 1;
        else if (n == 0 && sum != 0)
            return 0;
        else if (a[n - 1] <= sum) {
            return (countSumOfSubset(a, n - 1, sum - a[n - 1]) + countSumOfSubset(a, n - 1, sum));
        }
        return countSumOfSubset(a, n - 1, sum);
    }
}
