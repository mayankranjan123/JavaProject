package dynamicProgramming;

public class LCSSProblem {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        String x = "abcdgh";
        String y = "abedfhr";
        System.out.println(lcs(x, y, x.length(), y.length()));
    }

    private static int lcs(String x, String y, int m, int n) {
        int t [][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    t[i][j] = 0;
                else if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = (1 + t[i - 1][j - 1]);
                    max = Math.max(t[i][j], max);
                }
                else
                    t[i][j] = 0;
            }
        }
        return max;
    }
}
