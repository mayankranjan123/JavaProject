package GFGInterviewSeries;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println("1st non repeating: " + nonRepeat(s));
    }

    private static char nonRepeat(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for (Map.Entry<Character, Integer> res : map.entrySet()) {
            if (res.getValue() == 1) {
                return res.getKey();
            }
        }
        return '0';
    }
}
