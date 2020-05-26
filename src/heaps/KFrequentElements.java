package heaps;

import java.util.*;

public class KFrequentElements {
    public static void main(String[] args) {
        int a[] = new int[] {2,3,2,1,3,2,2,3,4};
        int k = 3;
        System.out.println("Frequent element: " + k + ": " + frequent(a, k));
    }

    private static int frequent(int[] a, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((b, c) -> c.getValue() - b.getValue());
        pq.addAll(map.entrySet());
        int freq = 0;
        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            freq =  pq.poll().getKey();
        }
        return freq;

    }
}
