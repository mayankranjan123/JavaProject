package GFGInterviewSeries;

public class StringRotation {
    public static void main(String[] args) {
        String a = "IndiaVsAustralia";
        String b = "AustraliaVsIndia";
        System.out.println(checkRotation(a, b));
    }

    private static boolean checkRotation(String a, String b) {
        int start = 0, end = 0;
        start = a.indexOf(b);
        return true;
    }
}
