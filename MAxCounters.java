/**
 * Created by MalhotR1 on 04/29/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MAxCounters {
    public static void main(String[] args) throws IOException {
        int[] arr = {3,4,4,6,1,4,4};
        int N = 5;
        int[] sol = new int[N];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (val <= N) {
                if (max > sol[val - 1]) sol[val - 1] = max;
                sol[val - 1]++;
                if (sol[val - 1] > max) max = sol[val - 1];
            } else {
                max++;
            }
        }



    }

}
