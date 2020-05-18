package dynamicProgramming;

public class SubsetSumProblem {
    int res[][];

    public int[][] getRes() {
        return res;
    }

    public void setRes(int[][] res) {
        this.res = res;
    }

    public static void main(String[] args) {
        int set[] = {2, 1};
        int sum = 3;
        System.out.println(new SubsetSumProblem().isSubset(set, set.length, sum));
    }

    public boolean isSubset(int[] set, int n, int sum) {
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
        res = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                int val = (t[i][j] == true ? 1 : 0);
                res[i][j] = val;
                System.out.print(val + " ");
            }
            System.out.println();
        }


        return t[n][sum];
    }

}
