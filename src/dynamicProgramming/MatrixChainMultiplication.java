package dynamicProgramming;

public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int a[] = new int[] {1, 2, 3, 4, 3};
        System.out.println(mcm(a, 1, a.length - 1));
    }

    private static int mcm(int[] a, int i, int j) {
        if (i >= j)
            return 0;
        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int temp = mcm(a, i, k) + mcm(a, k + 1, j) + (a[i - 1] * a[k] * a[j]);
            min = Math.min(min, temp);
        }
        return min;
    }
}
