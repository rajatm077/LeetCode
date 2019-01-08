/**
 * Created by MalhotR1 on 05/10/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Skyline {
    public static void main(String[] args) throws IOException {
        int[][] grid = {
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        };
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] vmax = new int[grid[0].length];
        int[] hmax = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            int htemp = 0;
            for (int j = 0; j < grid[i].length; j++) {
                hmax[i] = Math.max(hmax[i], grid[i][j]);
                vmax[j] = Math.max(vmax[j], grid[i][j]);
            }
        }


        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                total += Math.min(vmax[i], hmax[j]) - grid[i][j];
            }
        }

        return total;

    }

}
