/**
 * Created by MalhotR1 on 05/10/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseInteger {
    public static void main(String[] args) throws IOException {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        int val = 0;
        long temp = 0;
        boolean isNeg = x < 0;
        if (isNeg) x = -x;
        while (x > 0) {
            val = val * 10 + x % 10;
            temp = temp * 10 + x % 10;
            if (temp < Integer.MIN_VALUE || temp > Integer.MAX_VALUE) return 0;
            x /= 10;
        }
        if (isNeg) val = -val;
        return val;
    }

}
