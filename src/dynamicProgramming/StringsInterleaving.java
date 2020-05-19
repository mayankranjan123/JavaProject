package dynamicProgramming;

public class StringsInterleaving {
    public static void main(String[] args) {
        System.out.println(interleave("XXY", "XXZ", "XXZXXXY"));
    }

    private static boolean interleave(String a, String b, String c) {
        int i = 0, j = 0, k = 0;

        while (i < a.length() || j < b.length()) {
            if (a.charAt(i) == c.charAt(k)) {
                i ++;
                k ++;
            } else if (b.charAt(j) == c.charAt(k)) {
                j ++;
                k ++;
            } else
                return false;
        }
        if (i != a.length())
            return false;
        if (j != b.length())
            return false;
        return true;

    }
}
