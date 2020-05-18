package recursion;

public class SubsetSumRecursion {
    public static void main(String[] args) {
        int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(isSubsetSum(set, set.length, sum));
    }

    private static boolean isSubsetSum(int[] set, int n, int sum) {
        if (sum == 0)
            return true;
        if (n == 0 && sum != 0)
            return false;
        else if (set[n - 1] <= sum) {
            return (isSubsetSum(set, n - 1, sum - set[n - 1]) || isSubsetSum(set, n - 1, sum));
        }
        return isSubsetSum(set, n - 1, sum);
    }
}
