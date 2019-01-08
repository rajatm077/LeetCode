/**
 * Created by MalhotR1 on 05/27/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class LongestWordInDictionary {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] words = {"rac","rs","ra","on","r","otif","o","onpdu","rsf","rs","ot","oti","racy","onpd"};
            System.out.println(longestWord(words));
        }
    }


    public static String longestWord(String[] words) {
        if (words.length == 1) return words[0];
        Arrays.sort(words);
        StringBuilder sb = new StringBuilder();
        Trie root = constructTrie(words);
        while (root != null) {
            int count = 0;
            Trie temp = null;
            for (int i = 0; i < root.next.length; i++) {
                if (root.next[i] != null && root.next[i].count > count) {
                    count = root.next[i].count;
                    temp = root.next[i];
                }
            }
            if (temp != null) {
                sb.append(temp.crt);
            }
            root = temp;

        }

        return sb.toString();

    }

    private static Trie constructTrie(String[] words) {
        Trie root = new Trie();
        for (String w: words) {
            if (w.length() == 1) {
                char c = w.charAt(0);
                if (root.next[c - 'a'] == null) {
                    root.next[c - 'a'] = new Trie();
                    root.next[c - 'a'].count = 1;
                    root.next[c - 'a'].crt = c;
                }
                continue;
            }
            Trie temp = root;
            char[] arr = w.toCharArray();
            boolean flag = true;
            for (int i = 0; i < arr.length; i++) {
                char c = arr[i];
                if (temp.next[c - 'a'] != null) {
                    temp = temp.next[c - 'a'];
                }
                else if (temp.next[c - 'a'] == null && i == arr.length - 1) {
                    temp.count = Math.max(temp.count, w.length() - 1);
                    temp.next[c - 'a'] = new Trie();
                    temp.next[c - 'a'].crt = c;
                    temp = temp.next[c - 'a'];
                    temp.end = true;
                    temp.count = w.length();
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                char c = w.charAt(0);
                int cnt = root.next[c - 'a'].count;
                root.next[c - 'a'].count = Math.max(w.length(), cnt);
            }
        }
        return root;
    }

}

class Trie {
    char crt;
    Trie[] next = new Trie[26];
    int count;
    boolean end;

    public Trie() {
        count = 0;
        crt = '\0';
        end = false;
    }
}