package dynamicProgramming;

public class MinimumSubsetSum {
    public static void main(String[] args) {
        int a[] = new int [] {1, 2, 7};
        System.out.println(findMinimumSubsetSum(a));
    }

    private static int findMinimumSubsetSum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        int res[] = subsetSum(a, a.length, sum);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < res.length / 2; i++) {
            if (res[i] == 1) {
                min = Math.min(Math.abs(sum - 2 * i), min);
            }
        }
        return min;
    }

    private static int[] subsetSum(int[] a, int n, int sum) {
        int t [][] = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0)
                    t[i][j] = 1;
                else if (i == 0 && j != 0)
                    t[i][j] = 0;
                else if (a[i - 1] <= j)
                    t[i][j] = t[i - 1][j - a[i - 1]] + t[i - 1][j];
                else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n];
    }
}
