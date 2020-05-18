package dynamicProgramming;

public class MinOperationString {
    public static void main(String[] args) {
        String x = "heap";
        String y = "pea";
        LCSProblem lcs = new LCSProblem();
        int lcsLength = lcs.lcs(x, y, x.length(), y.length());
        System.out.println("Minimum Insertion: " + (y.length() - lcsLength));
        System.out.println("Minimum Deletion: " + (x.length() - lcsLength));
    }
}
