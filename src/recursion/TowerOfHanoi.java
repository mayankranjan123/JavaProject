package recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
     towerOfHanoi('s', 'h', 'd', 2);
     // s- source, h- helper, d- destination
    }

    static void towerOfHanoi(char s, char h, char d, int n) {
        if (n == 1) {
            System.out.println("Moving disc: " + n  + " from: " + s + " to:" + d);
            return;
        }
        towerOfHanoi(s, d, h, n - 1);
        System.out.println("Moving disc: " + n  + " from: " + s + " to:" + d);
        towerOfHanoi(h, s, d, n - 1);
    }
}
