package dynamicProgramming;

public class ShortestCommonSupersequence {
    public static void main(String[] args) {
        String x = "aggtab";
        String y = "gxtxayb";
        System.out.println(scs(x, y, x.length(), y.length()));
    }

    private static int scs(String x, String y, int m, int n) {
        LCSProblem lcs = new LCSProblem();
        return m + n - lcs.lcs(x, y, m, n);
    }
}
