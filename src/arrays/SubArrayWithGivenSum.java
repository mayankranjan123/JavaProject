package arrays;

import java.util.Scanner;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int a[] = new int[] {1, 4, 8,  20, 3, 10, 5};
        int sum = 0;
        subArray(a, sum);
    }

    private static void subArray(int[] a, int sum) {
        int left = 0, right = 0, res = 0;

        for (int i = 0; i < a.length; i++) {
            if (sum == res) {
                break;
            }
            res += a[i];
            if (res < sum) {
                right ++;
            }
            else if (res > sum) {
                res -= a[left];
                left ++;
            }
        }
        for (int i = left; i <= right; i++)
            System.out.print(a[i] + " ");
    }
}
