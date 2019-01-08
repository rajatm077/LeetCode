/**
 * Created by MalhotR1 on 04/29/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateAnArray {
    public static void main(String[] args)  {
        int k = 3;
        int[] arr = {3, 8, 9, 7, 6};
        int[] sol = new int[arr.length];
        if (k % arr.length == 0) return;
        for (int i = 0; i < arr.length; i++) {
            int n =  ((i - k) % arr.length + arr.length) % arr.length;
            sol[i] = arr[n];
        }

        for (int i = 0; i < sol.length; i++) {
            System.out.println(sol[i]);
        }
    }

}
