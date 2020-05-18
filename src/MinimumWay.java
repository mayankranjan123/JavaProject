import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumWay {

    public static void main(String[] args) {
        List<Integer> lis = new ArrayList<>();
        lis.add(4);
        lis.add(2);
        lis.add(3);
        lis.add(5);
        int sum = 21;
        Collections.sort(lis);
        int a[] = lis.stream().mapToInt(Integer::intValue).toArray();
        findMinCoin(a, sum);
    }

    static void findMinCoin(int coins[], int cost) {

        List<Integer> result = new ArrayList<>();
        for(int i = coins.length - 1; i >= 0; i --) {
            while(cost >= coins[i]) {
                cost -= coins[i];
                result.add(coins[i]);//add coin in the list
            }
        }

       for (Integer i : result) {
           System.out.print(i + " ");
       }
    }
}