package backtracking;

import java.util.ArrayList;
import java.util.List;

public class MinimumCoinChange {
    static List<Integer> result;
    static int min = Integer.MAX_VALUE;
        public static void main(String[] args) {
            int a[] = new int[] { 1, 4, 5, 6};
            int sum = 10;
            int n = a.length;
            List<Integer> res = new ArrayList<>();
            minCoinChange(a, n, res, sum);
            System.out.println(result);
        }

        private static void minCoinChange(int[] a, int n, List<Integer> res, int sum) {
            if (sum == 0) {
                if (min > res.size()) {
                    min = res.size();
                    result = new ArrayList<>(res);
                }
                return;
            } else if (n == 0 && sum != 0) {
                return;
            } else {
                // Don't add in result
                minCoinChange(a, n - 1, res, sum);
                List<Integer> res1 = new ArrayList<>(res);
                res1.add(a[n - 1]);
                // Add in result
                minCoinChange(a, n -1, res1, sum - a[n - 1]);
            }
        }
    }
