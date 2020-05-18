package recursion;

public class CombinationOfKLength {
    public static void main(String[] args) {
        String s = "aba";
        int k = 1;
        printCombination(s.toCharArray(), s.length(), k, "");
    }

    private static void printCombination(char[] s, int n, int k, String prefix) {
        if (k == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < n; i++) {
            printCombination(s, n, k - 1, prefix + s[i]);
        }


    }
}
