package dynamicProgramming;

public class LongestRepeatingSubsequence {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println("LRS: " + lrs(s, s));
    }

    private static int lrs(String a, String b) {
        int t[][] = new int[a.length() + 1][a.length() + 1];
        int m = a.length();
        int n = b.length();

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    t[i][j] = 0;
                else if (a.charAt(i - 1) == b.charAt(j - 1) && i != j) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return t[m][n];
    }
}
