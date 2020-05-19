package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargest {
    public static void main(String[] args) {
        int a[] = new int[] {1, 2, 0, 4, 6, 3};
        int k = 2;
        System.out.println("Largest element: " + k + ": " + largest(a, k));
    }

    private static int largest(int[] a, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer i : a)
            maxHeap.add(i);

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            largest = maxHeap.poll();
        }
        return largest;
    }
}
