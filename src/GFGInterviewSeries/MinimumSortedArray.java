package GFGInterviewSeries;

public class MinimumSortedArray {
    public static void main(String[] args) {
        int[] a = { 1, 3, 2, 7, 5, 6, 4, 8 };
        minSortedArray(a);
    }

    private static void minSortedArray(int[] a) {
        int start = 0, end = a.length - 1;
        int s = 0, e = 0;

        while (start <= end) {
            if (s == 1 && e == 1)
                break;

            if (a[start] < a[start + 1] && s == 0) {
                start ++;
            } else {
               s = 1;
            }

            if (a[end] > a[end - 1] && e == 0) {
                end --;
            } else {
                e = 1;
            }
        }
        System.out.println("Sorted");
    }
}
