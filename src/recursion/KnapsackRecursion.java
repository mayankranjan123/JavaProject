package recursion;

public class KnapsackRecursion {
    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int  W = 50;
        System.out.println(knapsack(wt, val, wt.length, W));
    }

    private static int knapsack(int[] wt, int[] val, int n, int W) {
        if (n == 0 || W == 0)
            return 0;
        else if (wt[n - 1] <= W) {
            return Math.max(val[n - 1] + knapsack(wt, val, n - 1, W - wt[n - 1]),
                    knapsack(wt, val, n - 1, W));
        }
        return knapsack(wt, val, n - 1, W);
    }
}
