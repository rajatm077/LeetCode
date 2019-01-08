/**
 * Created by MalhotR1 on 04/29/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FavLanguage {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                String[] in = br.readLine().trim().split(" ");
                int N = Integer.parseInt(in[0]);
                int L = Integer.parseInt(in[1]);
                int[] languages = new int[L];
                in = br.readLine().trim().split(" ");
                int total = 0;
                int responded = 0;
                for (int i = 0; i < in.length; i++) {
                    languages[i] = Integer.parseInt(in[i]);
                    responded += languages[i];
                }

                for (int i = 0; i < languages.length; i++) {
                    total += Math.round(languages[i] * 100.00 / responded);
                }

                System.out.println("Case #" + t+1 + " " + total);

            }
        }
    }

}
