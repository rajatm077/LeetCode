/**
 * Created by MalhotR1 on 05/10/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidIP {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine();
            System.out.println(validIP(input));

        }
    }

    private static String validIP(String IP) {

        if (IP.indexOf('.') > 0) {
            String[] in = IP.trim().split("\\.");
            if (in.length != 4) return "Neither";
            else return checkIPv4(in);
        } else if (IP.indexOf(':') > 0) {
            String[] in = IP.trim().split(":");
            if (in.length != 8) return "Neither";
            else return checkIPv6(in);
        } else {
            return "Neither";
        }
    }

    private static String checkIPv6(String[] in) {
        for (int i = 0; i < in.length; i++) {
            if (in[i].length() > 4 || in[i].length() == 0) return "Neither";
            if(in[0].charAt(0) == '0') return "Neither";
            long val = 0;
            in[i] = in[i].toLowerCase();
            char[] str = in[i].toCharArray();
            for (int j = 0; j < str.length; j++) {
                int temp = 0;
                if (str[j] >= 'a' && str[j] <= 'f') temp = 10 + (str[j] - 'a');
                else if (str[j] >= '0' && str[j] <= '9') temp = str[j] - 'a';
                else return "Neither";

                val = val * (long) Math.pow(16, j) + temp;
            }
        }
        return "IPv6";
    }

    private static String checkIPv4(String[] in) {
        for (int i = 0; i < in.length; i++) {
            int val = 0;
            try {
                val = Integer.parseInt(in[i]);
            } catch (NumberFormatException nfe) {
                return "Neither";
            }

            if (val > 255 || val < 0) return "Neither";
            if (in[i].charAt(0) == '0') return "Neither";
        }
        return "IPv4";

    }

}
