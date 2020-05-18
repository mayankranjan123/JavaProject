package dynamicProgramming;

public class CoinChangeProblem {
    public static void main(String[] args) {
        int a[] = new int[] {1, 2, 3};
        int sum = 5;
        System.out.println(totalWays(a, a.length, sum));
    }

    private static int totalWays(int[] a, int n, int sum) {
        int t [][] = new int [n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0)
                    t[i][j] = 1;
                else if (i == 0 && j != 0)
                    t[i][j] = 0;
                else if (a[i - 1] <= j)
                    t[i][j] = t[i][j - a[i - 1]] + t[i - 1][j];
                else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n][sum];
    }
}
