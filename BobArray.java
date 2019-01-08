/**
 * Created by MalhotR1 on 05/04/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class BobArray {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int N = Integer.parseInt(in[0]);
            int Q = Integer.parseInt(in[1]);
//            HashMap<Integer, Integer> hm = new HashMap<>();
            int[] cnt = new int[N];
            for (int i = 0; i < Q; i++) {
                in = br.readLine().trim().split(" ");
                int a = Integer.parseInt(in[0]);
                int index = Integer.parseInt(in[1]) - 1;
                if (a == 1) {
                    cnt[index]++;
                } else if (a == 2) {
                    cnt[index]--;
                } else {
                    int end = Integer.parseInt(in[2]) - 1;
                    int count = 0;
                    for (int j = index; j <= end; j++) {
                        count += cnt[j];
                    }
                    System.out.println(count);
                }
            }
        }
    }

}
