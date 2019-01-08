/**
 * Created by MalhotR1 on 05/27/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PallindromeNumber {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in =
            System.out.println(isPalindrome(121));
        }
    }
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        int temp = x;
        long res = 0;
        while (temp > 0) {
            res = res * 10 + temp % 10;
            temp = temp / 10;
        }
        if  (res == x) return true;
        else return false;
    }
}
