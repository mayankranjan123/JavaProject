package recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(findSum(3));
    }

    static int findSum(int n) {
        if (n == 1)
            return 1;
        return n + findSum(n - 1);
    }
}
