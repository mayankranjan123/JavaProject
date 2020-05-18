package recursion;

public class LCSRecursion {
    public static void main(String[] args) {
        String x = "abcdgh";
        String y = "abedfhr";
        System.out.println(lcs(x, y, x.length(), y.length()));
    }

    private static int lcs(String x, String y, int m, int n) {
        if (m == 0|| n == 0)
            return 0;
        else if (x.charAt(m - 1) == y.charAt(n - 1))
            return (1 + lcs(x, y, m - 1 , n - 1));
        return Math.max(lcs(x, y, m , n - 1), lcs(x, y, m - 1, n));
    }
}
