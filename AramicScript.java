/**
 * Created by MalhotR1 on 05/01/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class AramicScript {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i < in.length; i++) {
                char[] str = in[i].toCharArray();
                int[] chars = new int[26];
                for (int j = 0; j < str.length; j++) {
                    if (chars[str[j] - 'a'] == 0) {
                        chars[str[j] - 'a'] = 1;
                    }
                }
                StringBuffer root = new StringBuffer();
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] > 0) root.append((char) (j + 'a'));
                }
                set.add(root.toString());
            }

            System.out.println(set.size());
        }
    }

}
