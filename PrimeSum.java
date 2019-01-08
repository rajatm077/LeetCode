/**
 * Created by MalhotR1 on 05/07/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrimeSum {
    public static void main(String[] args) throws IOException {
        find(1048574);
    }

    private static void find(int num) {

        int[] arr = new int[num-2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;
        }

        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == -1) continue;
            primes.add(arr[i]);
            int k = arr[i];
            for (int j = i+k; j < arr.length; j+=k) {
                if (arr[j] % k == 0) arr[j] = -1;
            }
        }

        for (int i = 0; i <= primes.size() / 2; i++) {
            int f = primes.get(i);
            int index = Collections.binarySearch(primes, num - f);
            if (index > 0) {
                System.out.println(f + " " + primes.get(index));
                break;
            }
        }


    }

}
