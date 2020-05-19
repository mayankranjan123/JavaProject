package dynamicProgramming;

public class WineSellingProblem {
    public static void main(String[] args) {
        int price[] = { 2, 4, 6, 2, 5 };
        System.out.println("Maximum profit: " + maxProfit(price, 0, price.length - 1, 1));
    }

    private static int maxProfit(int[] price, int m, int n, int count) {
        if (m == n)
            return count * price[m];
        else {
            int right = count * price[m] + maxProfit(price, m + 1, n, count + 1);
            int left = count * price[n] + maxProfit(price, m, n - 1, count + 1);
            return Math.max(left, right);
        }
    }
}
