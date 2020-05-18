package dynamicProgramming;

public class KnapsackProblem {
    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int  W = 50;
        System.out.println(knapsack(wt, val, wt.length, W));
    }

    private static int knapsack(int[] wt, int[] val, int n, int W) {
        int t [][] = new int [n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                if (i == 0|| j == 0)
                    t[i][j] = 0;
                else if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                System.out.print(t[i][j]+ " ");
            }
            System.out.println();
        }
        return t[n][W];
    }
}
