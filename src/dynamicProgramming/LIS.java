package dynamicProgramming;

import java.util.Arrays;

public class LIS {
    public static void main(String[] args) {
        int a[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        System.out.println("Longest increasing subsequence: " + lis(a, a.length));
    }

    private static int lis(int[] a, int n) {
        int lis[] = new int[n];
        Arrays.fill(lis, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            max = Math.max(max, lis[i]);

        return max;
    }
}
