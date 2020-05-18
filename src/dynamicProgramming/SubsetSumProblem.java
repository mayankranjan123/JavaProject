package dynamicProgramming;

public class SubsetSumProblem {
    public static void main(String[] args) {
        int set[] = {2, 1};
        int sum = 3;
        System.out.println(isSubset(set, set.length, sum));
    }

    private static boolean isSubset(int[] set, int n, int sum) {
        boolean t [][] = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0)
                    t[i][j] = true;
                else if (i == 0 && j != 0)
                    t[i][j] = false;
                else if (set[i - 1] <= j) {
                    t[i][j] = (t[i - 1][j - set[i - 1]] || t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                System.out.print((t[i][j] == true ? 1 : 0)+ " ");
            }
            System.out.println();
        }


        return t[n][sum];
    }

}
