/**
 * Created by MalhotR1 on 05/04/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Candies {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char[] in = br.readLine().trim().toCharArray();

            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int[] chars = new int[26];
                for (int i = 0; i < in.length; i++) {
                    chars[in[i] - 'a']++;
                }

                int max = 0;
                for (int i = 0; i < chars.length; i++) {
                    max = (chars[i] > max) ? chars[i] : max;
                }

                int k = Integer.parseInt(br.readLine().trim());
                if (k > in.length) {
                    System.out.println(-1);
                    continue;
                }

                if (k <= max) {
                    System.out.println(k);
                    continue;
                }

                int total = 0;

                for (int i = 0; i < chars.length && k > 0; i++) {
                    if (chars[i] > 0) {
                        if (k == 1) {
                            k--;
                            total++;
                        } else {
                            if (chars[i] % 2 == 0) {
                                if (chars[i] > k) { total += k; k = 0; }
                                else { total += chars[i]; k -= chars[i]; }
                            }
                        }
                    }
                }

                if (k == 0) System.out.println(total);
                else System.out.println(-1);
            }
        }
    }

}
