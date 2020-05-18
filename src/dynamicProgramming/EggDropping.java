package dynamicProgramming;

public class EggDropping {
    public static void main(String[] args) {
        int f = 10, e = 2;
        System.out.println(solve(e, f));
    }

    private static int solve(int e, int f) {
        if (f == 0 || e == 0 || f == 1)
            return f;
        int min = Integer.MAX_VALUE;
        for (int k = 1; k <= f; k++) {
            int temp = 1 + Math.max(solve(e - 1, k - 1), solve(e, f - k));
            min = Math.min(min, temp);
        }
        return min;
    }
}
