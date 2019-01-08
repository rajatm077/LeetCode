/**
 * Created by MalhotR1 on 05/27/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) throws IOException {
        int[][] arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        arr = flipAndInvertImage(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int s = 0;
            int e = A[i].length - 1;
            while (s < e) {
                if (A[i][s] != A[i][e]) {
                    A[i][s] ^= 1;
                    A[i][e] ^= 1;
                }
                s++;
                e--;
            }
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] ^= 1;
            }
        }
        return A;
    }
}
