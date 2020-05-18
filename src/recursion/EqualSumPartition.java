package recursion;

import dynamicProgramming.SubsetSumProblem;

public class EqualSumPartition {
    public static void main(String[] args) {
        int a[] = {3, 1, 5, 9, 12};
        System.out.println(equalSumPartition(a));
    }

    private static boolean equalSumPartition(int[] a) {
            SubsetSumProblem sb = new SubsetSumProblem();
            int sum = 0;
            for (int i = 0; i < a.length; i++)
                sum += a[i];
            if (sum % 2 != 0)
                return false;
            else {
                return sb.isSubset(a, a.length, sum / 2);
            }
    }
}
