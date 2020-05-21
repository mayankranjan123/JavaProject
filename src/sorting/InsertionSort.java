package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = new int[] {5, 7, 0, 1, 9, 8};
        insertionSort(a);
        for (Integer i : a)
            System.out.print(i + " ");
    }

    private static void insertionSort(int[] a) {
        int n = a.length - 1;
        for (int i = 1; i <= n; i++) {
            int temp = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j --;
            }
            a[j + 1] = temp;
        }
    }
}
