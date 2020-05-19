package GFGInterviewSeries;

public class StringPermutation {
    public static void main(String[] args) {
        String s = "abc";
        permute(s, 0, s.length());
    }

    private static void permute(String s, int start, int end) {
        if (start == end)
            System.out.println(s);
        else {
            for (int i = start; i < end; i++) {
                s = swap(s, start, i);
                permute(s, start + 1, end);
                s = swap(s, start, i);
            }
        }
    }

    private static String swap(String s, int i, int j) {
        char c[] = s.toCharArray();
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        return String.valueOf(c);

    }
}
