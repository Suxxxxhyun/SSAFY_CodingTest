package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution5688 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            long n = Long.parseLong(br.readLine());
            long ans = -1;
            long result = (long)Math.cbrt(n);
            if(result * result * result == n) {
                ans = result;
            }
            System.out.println("#" + i + " " + ans);
        }
    }

}

