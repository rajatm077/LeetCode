/**
 * Created by MalhotR1 on 05/10/2018.
 */

import com.sun.org.apache.bcel.internal.classfile.Code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Random;
import java.util.regex.Pattern;

public class TinyURL {
    public static void main(String[] args) throws IOException {
        String url = "ftp://174.123.452.34/directory/file";
        Codec codec = new Codec();
        System.out.println(codec.encode(url));
        System.out.println(codec.decode(codec.encode(url)));

    }

}

class Codec {

    String[] al;
    String protocol;
    boolean lastslash;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (longUrl.charAt(longUrl.length() - 1) == '/') lastslash = true;

        StringBuilder sb = new StringBuilder();
        String[] protocol = longUrl.split(":");

        this.protocol = protocol[0];

        sb.append(this.protocol + "://");

        al = protocol[1].substring(2).split("/");

        for (int i = 0; i < al.length; i++) {
            sb.append(i);
            if (i != al.length - 1) sb.append("/");
        }
        return sb.toString();
        //        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {

        StringBuilder sb = new StringBuilder();
        sb.append(this.protocol + "://");
        for (int i = 0; i < al.length; i++) {
            sb.append(al[i]);
            if (i != al.length - 1) sb.append("/");
        }
        if (lastslash) sb.append("/");
        return sb.toString();
    }
}
