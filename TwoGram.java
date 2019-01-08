/**
 * Created by MalhotR1 on 05/06/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class TwoGram {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String in = br.readLine().trim();
            HashMap<String, Integer> hm = new HashMap<>();
            for (int i = 0; i < in.length() - 1; i++) {
                String sb = in.substring(i, i + 2);
                if (hm.containsKey(sb)) hm.replace(sb, hm.get(sb), hm.get(sb) + 1);
                else hm.put(sb, 1);
            }

            int freq = 0;
            String sol = "";
            for (String k : hm.keySet()) {
                if (hm.get(k) > freq) {
                    freq = hm.get(k);
                    sol = k;
                }
            }

            System.out.println(sol);
        }
    }

}
