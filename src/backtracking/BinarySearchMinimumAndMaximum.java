package backtracking;

public class BinarySearchMinimumAndMaximum {
    static int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int a[] = new int[] {2, 1, 5, 4, 0};
        findMinAndMax(a, 0, a.length - 1);
        System.out.println("Minimum: " + min + " and maximum: " + max);
    }

    private static void findMinAndMax(int[] a, int lb, int ub) {
        if (lb == ub) {
            if (max  < a[lb]) {
                max = a[lb];
            }
            if (min > a[lb]) {
                min = a[lb];
            }
        } else if (ub - lb == 1) {
            if (a[lb] < a[ub]) {
               if (a[lb] < min) {
                   min = a[lb];
               }
               if (a[ub] > max) {
                   max = a[ub];
               }
            } else {
                if (a[ub] < min) {
                    min = a[ub];
                }
                if (a[lb] > max) {
                    max = a[lb];
                }
            }
        } else {
            int mid = (lb + ub) / 2;
            findMinAndMax(a, 0, mid);
            findMinAndMax(a, mid + 1, ub);
        }

    }
}
