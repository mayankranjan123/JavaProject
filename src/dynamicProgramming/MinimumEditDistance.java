package dynamicProgramming;

public class MinimumEditDistance {
    public static void main(String[] args) {
        String x = "sunday";
        String y = "saturday";
        System.out.println(edit(x, y, x.length(), y.length()));
    }

    private static int edit(String x, String y, int m, int n) {
        if (m == 0)
            return n;
        else if (n == 0)
            return m;
        else if (x.charAt(m - 1) == y.charAt(n - 1)) {
            return edit(x, y, m - 1, n - 1);
        } else {
            return 1 +  min(edit(x, y, m - 1, n - 1),
                        edit(x, y, m - 1, n),
                        edit(x, y, m, n - 1));
        }
    }

    private static int min(int a, int b, int c) {
        if (a < b) {
            if (a < c)
                return a;
        } else {
            if (b < c)
                return b;
        }
        return c;
    }

}
