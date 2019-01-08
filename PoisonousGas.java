/**
 * Created by MalhotR1 on 05/04/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoisonousGas {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine().trim());
                String[] in = br.readLine().trim().split(" ");
                long[] arr = new long[in.length];
                for (int i = 0; i < in.length; i++) {
                    arr[i] = Long.parseLong(in[i]);
                }

                long maxSum = getMaxSum(arr);
                if (maxSum < 2) { System.out.println("No"); continue; }
                if (((maxSum & 1L) == 0) && ((maxSum & (maxSum - 1)) == 0)) System.out.println("Yes");
                else System.out.println("No");

            }
        }
    }

    private static long getMaxSum(long[] arr) {

        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) sum += arr[i];
        }
        return sum;
    }

}
