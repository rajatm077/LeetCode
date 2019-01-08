/**
 * Created by MalhotR1 on 05/06/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.PriorityQueue;

public class LessEqual {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int k = Integer.parseInt(in[1]);
            in = br.readLine().trim().split(" ");
            long[] arr = new long[in.length];

            PriorityQueue<Long> mh = new PriorityQueue<>();
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
            for (int i = 0; i < in.length; i++) {
                arr[i] = Long.parseLong(in[i]);
                mh.add(arr[i]);
                min = (arr[i] < min) ? arr[i] : min;
                max = (arr[i] > max) ? arr[i] : max;

            }

            long val = 0;
            if (k == 0) {
                val = min - 1;
                if (val < 1) System.out.println(-1);
                else System.out.println(val);
            } else if (k >= n) {
                System.out.println(max);
            } else {
                while (k > 0) {
                    val = mh.remove();
                    k--;
                }

                long temp = mh.remove();
                if (val == temp || val > 1000000000) System.out.println(-1);
                else System.out.println(val);
            }

        }
    }

}
