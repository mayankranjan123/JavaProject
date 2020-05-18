package dynamicProgramming;

public class LCSProblem {
    public static void main(String[] args) {
        String x = "abcdgh";
        String y = "abedfhr";
        System.out.println(new LCSProblem().lcs(x, y, x.length(), y.length()));
    }

    public int lcs(String x, String y, int m, int n) {
        int t [][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    t[i][j] = 0;
                else if (x.charAt(i - 1) == y.charAt(j - 1))
                    t[i][j] = (1 + t[i - 1][j - 1]);
                else
                    t[i][j] = Math.max(t[i- 1][j], t[i][j - 1]);
            }
        }
        return t[m][n];
    }
}
