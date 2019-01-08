/**
 * Created by MalhotR1 on 12/17/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) throws IOException {
        int[] arr = {1,1};
        int len = removeDuplicates(arr);
        System.out.println(len);
        for (int i: arr){
            System.out.println(i);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int next = i+1;
        while (next < nums.length) {
            while (next < nums.length && nums[next] == nums[i]) next++;
            if (next < nums.length) swap(nums, i+1, next);
            next++;
            i++;
        }

        return i;
    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
