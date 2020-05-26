package recursion;

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int a[] = new int[] {1, 2, 3, 4, 5};
        sumTriangle(a);
    }

    private static void sumTriangle(int[] a) {
        if (a.length == 0) {
            return;
        } else {
            int temp[] = new int[a.length - 1];
            for (int i = 0; i < temp.length; i++) {
                int sum = a[i] + a[i + 1];
                temp[i] = sum;
            }
            sumTriangle(temp);
            System.out.println(Arrays.toString(a));
        }
    }
}
