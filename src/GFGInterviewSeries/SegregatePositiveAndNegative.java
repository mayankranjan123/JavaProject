package GFGInterviewSeries;

public class SegregatePositiveAndNegative {
    public static void main(String[] args) {
        int[] a = { 9, -3, 5, -2, -8, -6, 1, 3 };
        // based on quickSort partition logic
        segregate(a, 0, a.length - 1);
        for (Integer i : a)
            System.out.print(i + " ");
    }

    // instead of pivot = a[end], we tae pivot = 0;
    private static void segregate(int[] a, int start, int end) {
        int pIndex = start;
        int pivot = 0;
        for (int i = start; i <= end; i++) {
            if (a[i] < pivot) {
                swap(a, i, pIndex);
                pIndex ++;
            }
        }
    }
    static void swap(int[] a, int x, int y) {
        a[x] = a[x] ^ a[y];
        a[y] = a[x] ^ a[y];
        a[x] = a[x] ^ a[y];
    }
}
