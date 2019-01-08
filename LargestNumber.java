/**
 * Created by MalhotR1 on 05/04/2018.
 */

import com.sun.org.apache.bcel.internal.generic.LNEG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LargestNumber {
    public static void main(String[] args) throws IOException {
        int[] nums = {3,34,30,5,9};
        StringBuilder ab = new StringBuilder(Integer.toString(nums[0]));
        for (int i = 1; i < nums.length; i++) {
            String temp = ab.toString();
            ab.append(Integer.toString(nums[i]));
            String ba = Integer.toString(nums[i]) + temp;
            ab = (ab.toString().compareTo(ba) > 0) ? ab : new StringBuilder(ba);

        }

        System.out.println(ab.toString());
    }


}
