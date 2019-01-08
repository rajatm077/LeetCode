/**
 * Created by MalhotR1 on 04/29/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddOccurrencesInArray {
    public static void main(String[] args) throws IOException {
        int[] arr = {2, 3, 1, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int len = arr.length + 1;
        int total = (len % 2 == 0) ? (len / 2) * (len + 1) : ((len + 1) / 2) * len;
        System.out.println(total - sum);


    }

}
