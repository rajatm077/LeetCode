/**
 * Created by MalhotR1 on 05/18/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstMissingNumber {
    public static void main(String[] args) throws IOException {
        int[] nums = {2,1,4};
        System.out.println(fmp(nums));

    }

    private static int fmp(int[] nums) {
        if (nums.length == 0) return 1;
        else if (nums.length == 1 && nums[0] != 1) return 1;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                int index = Math.abs(nums[i]) - 1;
                if (index < nums.length && nums[index] > 0 && nums[index] <= nums.length)
                    nums[index] = -nums[index];
            }
        }

        for (int i=0; i<nums.length; i++) {
            if (nums[i] >= 0) return i+1;
        }
        return nums.length + 1;
    }

}
