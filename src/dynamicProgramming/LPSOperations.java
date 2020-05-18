package dynamicProgramming;

public class LPSOperations {
    public static void main(String[] args) {
        String x = "abcb";
        LPSProblem lps = new LPSProblem();
        int lpsLength = lps.lps(x, new StringBuffer(x).reverse().toString());
        System.out.println("Insertion or deletion required to make it palindrome : " + (x.length() - lpsLength));
    }
}
