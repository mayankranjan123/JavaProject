package GFGInterviewSeries;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    static class Orange {
        int time;
        int x, y;

        public Orange(int time, int x, int y) {
            this.time = time;
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        int a[][] = { {2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}};
        System.out.println("Min time required to rot all oranges: " + rotOranges(a));
    }

    private static int rotOranges(int[][] a) {
        Queue<Orange> queue = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 2) {
                    queue.add(new Orange(0, i, j));
                }
            }
        }

        int p, q, t = 0;
        while (!queue.isEmpty()) {
            Orange element = queue.remove();
            p = element.x + 1;
            q = element.y;
            t = element.time;
            if ((p >= 0 && p <= a.length - 1) && (q >= 0 && q <= a[0].length - 1)) {
                if (a[p][q] == 1) {
                    a[p][q] = 2;
                    queue.add(new Orange(t + 1, p, q));
                }
            }
            p = element.x;
            q = element.y + 1;
            t = element.time;
            if ((p >= 0 && p <= a.length - 1) && (q >= 0 && q <= a[0].length - 1)) {
                if (a[p][q] == 1) {
                    a[p][q] = 2;
                    queue.add(new Orange(t + 1, p, q));
                }
            }

            p = element.x - 1;
            q = element.y;
            t = element.time;
            if ((p >= 0 && p <= a.length - 1) && (q >= 0 && q <= a[0].length - 1)) {
                if (a[p][q] == 1) {
                    a[p][q] = 2;
                    queue.add(new Orange(t + 1, p, q));
                }
            }

            p = element.x;
            q = element.y - 1;
            t = element.time;
            if ((p >= 0 && p <= a.length - 1) && (q >= 0 && q <= a[0].length - 1)) {
                if (a[p][q] == 1) {
                    a[p][q] = 2;
                    queue.add(new Orange(t + 1, p, q));
                }
            }
        }
        return t;
    }
}
