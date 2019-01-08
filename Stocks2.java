/**
 * Created by MalhotR1 on 12/18/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Stocks2 {
    public static void main(String[] args) throws IOException {
        int[] arr = {7,6,4,3,1};
        int sum = maxProfit(arr);
        System.out.println(sum);
    }

    public static int maxProfit(int[] prices) {
        int diff = 0;
        int start = 0;
        for (int end = 1; end < prices.length; end++) {
            if (prices[end] > prices[start]) {
                diff += prices[end] - prices[start];
                start++;
            }
            else start = end;
        }
        return diff;
    }

}
