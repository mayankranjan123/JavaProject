package recursion;

public class RodCuttingRecursion {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int a[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(rodCutting(a, a.length));

    }

    private static int rodCutting(int[] a, int n) {
        if (n <= 0)
            return 0;
        max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, rodCutting(a, n - i - 1) + a[i]);
        }
        return max;
    }
}
