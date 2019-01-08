/**
 * Created by MalhotR1 on 04/29/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryGap {
    public static void main(String[] args) throws IOException {
        int N = 1;
        int len = Integer.MIN_VALUE;
        int temp = 0;
        boolean first = false;
        while (N > 0) {
            int r = N & 1;
            if (r == 1) {
                if (!first) {
                    first = true;
                } else {
                    len = (temp > len) ? temp : len;
                    temp = 0;
                }
            } else {
                if (first) temp++;
            }

            N >>= 1;
        }
        len = (temp > len) ? temp : len;
        System.out.println(len);
    }

}
