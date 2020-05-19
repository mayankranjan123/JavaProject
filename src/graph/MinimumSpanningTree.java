package graph;

public class MinimumSpanningTree {
    public static void main(String[] args) {
        //minDist(3, 2, 8, 8, 1, 4) -  ans - 6
        System.out.println("Minimum distance: " + minDist(8, 9, 7, 2, 9, 4));
    }

    static int minDist(int ha, int hb, int hc, int ac, int ab, int bc) {
        int min = 0;
        if (ha < hb) {
            min += ha;
            if (ab < ac) {
                min = min + ab + hb;
            } else {
                min = min + ac + hc;
            }
        } else {
            min += hb;
            if (ab < bc) {
                min = min + ab + ha;
            } else {
                min = min + bc + hc;
            }
        }
        return min;
    }
}
