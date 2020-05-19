package arrays;

import java.util.ArrayList;
import java.util.List;

public class MinimumDistance {
    public static void main(String[] args) {
        int a[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        int x = 3;
        int y = 6;
        MinimumDistance min = new MinimumDistance();
        System.out.println("Minimum distance: "  + min.minDistance(a, x, y));
    }

    private int minDistance(int[] a, int x, int y) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                even.add(i);
            }
            if (a[i] == y) {
                odd.add(i);
            }
        }

        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < even.size(); i++) {
            for (int j = 0; j < odd.size(); j++) {
                diff = Math.min(diff, Math.abs(even.get(i) - odd.get(j)));
            }
        }
        return diff;
    }
}
