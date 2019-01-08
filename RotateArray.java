/**
 * Created by MalhotR1 on 12/18/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) throws IOException {
        int [] arr = {1,2,3,4,5,6,7};
        rotate(arr, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void rotate(int[] nums, int k) {
        int[] sol = new int[nums.length];
        for (int i=0; i < nums.length; i++) {
            int index = (i + k) % nums.length;
            sol[index] = nums[i];
        }
        nums = sol;

    }

}
