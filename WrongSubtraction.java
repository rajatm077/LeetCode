/**
 * Created by MalhotR1 on 05/06/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WrongSubtraction {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            long N = Long.parseLong(in[0]);
            int k = Integer.parseInt(in[1]);
            for (int i = 0; i < k; i++) {
                int r = (int) (N % 10);
                if (r != 0) N--;
                else N = N / 10;
            }
            System.out.println(N);
        }
    }

}
