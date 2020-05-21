package GFGInterviewSeries;

public class Segregate0And1 {
    public static void main(String[] args) {
       int a[] = new int[] {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
       segregate(a);
        for (Integer i : a)
            System.out.print(i + " ");
    }

    private static void segregate(int[] a) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 1) {
                a[k] = a[i];
                k ++;
            }
        }

        for (int i = k; i < a.length; i++)
            a[i] = 1;
    }
}