
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Mancala {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String[] in = br.readLine().trim().split(" ");
            long[] arr = new long[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Long.parseLong(in[i]);
            }


            long count = 0;
            long max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    count = getCount(Arrays.copyOf(arr, arr.length), i);
                    max = (count > max) ? count : max;
                }
            }
            System.out.println(max);
        }
    }

    private static long getCount(long[] arr, int i) {
        long val = arr[i] + 1;
        arr[i] = 0;
        for (int j = 0; j < arr.length; j++) {
            arr[j] += val / 14;
        }

        val = val % 14;
        for (int j = 0; j < val - 1; j++) {
            i = (i + 1) % arr.length;
            arr[i] += 1;
        }

        long count = 0;
        for (int j = 0; j < arr.length; j++) {
            if ((arr[j] & 1) == 0) count += arr[j];
        }
        return count;
    }

}
