/**
 * Created by MalhotR1 on 04/27/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingBits {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            int N = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[N+1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = getBitLength(i);
                System.out.println(arr[i]);
            }


        }
    }

    private static int getBitLength(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) count++;
            num >>= 1;
        }
        return count;
    }
}
