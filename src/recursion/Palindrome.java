package recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abad", 0, 4 - 1));
    }

    private static boolean isPalindrome(String s, int m, int n) {
        if (m >= n)
            return true;
        else if (m < n && s.charAt(m) == s.charAt(n)) {
            return isPalindrome(s, m + 1, n - 1);
        }
        return false;
    }
}
