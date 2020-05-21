package GFGInterviewSeries;

import java.util.*;

public class SumPair {
    public static void main(String[] args) {
        int a[] = new int[] {2,1,3,6,8};
        int sum = 9;
       // System.out.println(pairExistsSorted(a, sum));
        System.out.println(pairExistsHashing(a, sum));
    }

    private static boolean pairExistsHashing(int[] a, int sum) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : a) {
            if (set.contains(sum - i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }

    private static void pairExistsMap(int[] nums, int target) {
        int res [] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        System.out.println( res);
    }

    private static boolean pairExistsSorted(int[] a, int sum) {
        Arrays.sort(a);
        int start = 0, end = a.length - 1, f = 0;
        while (start <= end) {
            if (a[start] + a[end] > sum) {
                end --;
            } else if (a[start] + a[end] < sum) {
                start ++;
            } else{
                f = 1;
                break;
            }
        }
        return (f == 1) ? true : false;
    }
}
