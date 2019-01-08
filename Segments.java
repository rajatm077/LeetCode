/**
 * Created by MalhotR1 on 05/27/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Segments {
    public static void main(String[] args) {
        System.out.println(countSegments(", , , ,        a, eaefa"));
    }

    public static int countSegments(String s) {
        if (s.equals("")) return 0;
        int count = 0;
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) count++;
        }
        return count;
    }
}
