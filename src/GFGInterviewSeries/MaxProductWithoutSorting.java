package GFGInterviewSeries;

public class MaxProductWithoutSorting {
    public static void main(String[] args) {
        int [] a = { 1, -4, 3, -6, 7, 0 };
        System.out.println("Max Product: " + maxProduct(a));
    }

    private static int maxProduct(int[] a) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, max1 = Integer.MIN_VALUE,
                max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1)
            {
                max3 = max2;
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2)
            {
                max3 = max2;
                max2 = a[i];
            } else if (a[i] > max3) {
                max3 = a[i];
            }

            if (a[i] < min1)
            {
                min2 = min1;
                min1 = a[i];
            }

            // Update second minimum element
            else if(a[i] < min2)
                min2 = a[i];
        }
        return Math.max(min1 * min2 * max1,
                max1 * max2 * max3);
    }
}
