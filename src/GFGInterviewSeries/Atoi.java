package GFGInterviewSeries;

import java.util.HashSet;
import java.util.Set;

public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("-2147483647"));
    }
    public static int myAtoi(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int res = 0, neg = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= 9; i++)
            set.add(i);

        s = s.trim();
        String t = "";
        try {
            for (int i = 0; i < s.length(); i++) {
                if (i == 0 && s.charAt(i) == '-') {
                    neg = 1;
                } else if (i == 0 && s.charAt(i) == '+') {
                    neg = 0;
                }
                else if (!set.contains(Integer.parseInt(String.valueOf(s.charAt(i))))) {
                    break;
                } else {
                    t = t + s.charAt(i);
                }
            }
        } catch (Exception e) {

        }

        try {
            if (t.length() == 0)
                return 0;
            else if (neg == 1 && Integer.parseInt(t) <= Integer.MAX_VALUE) {
                return -1 * Integer.parseInt(t);
            } else if (Integer.parseInt(t) <= Integer.MAX_VALUE) {
                return Integer.parseInt(t);
            } else
                return Integer.MAX_VALUE;
        } catch (NumberFormatException e) {
            if (neg == 1)
                return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
    }
}
