package dynamicProgramming;

public class LPSProblem {
    public static void main(String[] args) {
        String x = "abcb";
        System.out.println("Longest Palindromic subsequence: " +
                new LPSProblem().lps(x, new StringBuffer(x).reverse().toString()));
    }
     public int lps(String x, String y) {
         int lps = new LCSProblem().
                 lcs(x, y, x.length(), y.length());
         return lps;
     }
}
