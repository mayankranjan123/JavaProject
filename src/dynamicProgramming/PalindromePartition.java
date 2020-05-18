package dynamicProgramming;

public class PalindromePartition {
    public static void main(String[] args) {
        String s = "niti";
        System.out.println(palindromePartition(s, 0, s.length() - 1));
    }

    private static int palindromePartition(String s, int i, int j) {
        if (i >= j)
            return 0;
        else if (isPalindrome(s, i, j))
            return 0;
        else {
            int min = Integer.MAX_VALUE;
            for (int k = i; k < j; k++) {
                int temp = 1 + palindromePartition(s, i, k) + palindromePartition(s, k + 1, j);
                min = Math.min(min, temp);
            }
            return min;
        }
    }

    private static boolean isPalindrome(String s, int i, int j) {
        String temp = s.substring(i, j + 1);
        StringBuffer sb = new StringBuffer(temp);
        if (temp.equals(sb.reverse().toString()))
            return true;
        return false;
    }
}
