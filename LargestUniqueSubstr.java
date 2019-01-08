/**
 * Created by MalhotR1 on 05/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class LargestUniqueSubstr {
    public static void main(String[] args) throws IOException {
        System.out.println(lengthOfLongestSubstring("abca"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        char[] str = s.toCharArray();
        int[] ascii = new int[256];

        for (int i = 0; i < ascii.length; i++) {
            ascii[i] = -1;
        }

        int start = 0;
        int end = start + 1;
        int temp = 1;
        int max = 1;

        ascii[str[start] - '\0'] = start;
        while (end < str.length) {
            int i_ascii = str[end] - '\0';
            if (ascii[i_ascii] != -1) {
                if (start > ascii[i_ascii]) {
                    temp++;
                } else {
                    start = 1 + ascii[i_ascii];
                    temp = end - start + 1;
                }
                ascii[i_ascii] = end;
            } else {
                ascii[i_ascii] = end;
                temp++;
            }
            max = (max > temp) ? max : temp;
            end++;
        }
        return max;

    }
}
