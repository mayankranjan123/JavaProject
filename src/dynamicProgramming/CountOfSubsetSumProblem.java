package dynamicProgramming;

public class CountOfSubsetSumProblem {
    public static void main(String[] args) {
        int a[] = {3, 1, 5, 9, 12};
        int sum = 9;
        System.out.println(countSubsetSum(a, a.length, sum));
    }

    private static int countSubsetSum(int[] a, int n, int sum) {
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
        return t[n][sum];
    }
}
