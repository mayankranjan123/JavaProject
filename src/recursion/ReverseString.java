package recursion;

public class ReverseString {
    public static void main(String[] args) {
        String s = "aba";
        char [] res = reverse(s.toCharArray(), 0, s.length() - 1);
        System.out.println(new String(res));
    }

    static char[] reverse(char[] s, int m, int n) {
        if (m == n)
            return s;
        else if (m < n) {
            char temp = s[m];
            s[m] = s[n];
            s[n] = temp;
            return reverse(s, m + 1, n - 1);
        }
        return s;
    }
}
