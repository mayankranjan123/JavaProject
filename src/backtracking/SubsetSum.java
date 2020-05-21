package backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        int a[] = new int[] { 1, 4, 20, 3, 10, 5};
        int sum = 33;
        int n = a.length;
        List<Integer> res = new ArrayList<>();
        subsetSum(a, n, res, sum);
    }

    private static void subsetSum(int[] a, int n, List<Integer> res, int sum) {
        if (sum == 0) {
            for (Integer i : res) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        } else if (n == 0 && sum != 0) {
           return;
        } else {
            subsetSum(a, n - 1, res, sum);
            List<Integer> res1 = new ArrayList<>(res);
            res1.add(a[n - 1]);
            subsetSum(a, n - 1, res1, sum - a[n - 1]);
        }
    }
}
