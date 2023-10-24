package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution3750 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=t; i++) {
            String n = br.readLine();
            //System.out.println(n + "," + n.length());
            while(n.length() > 1) {
                int ans = 0;
                for(int j=0; j<n.length(); j++) {
                    int x = n.charAt(j) - '0';
                    ans += x;
                }
                n = String.valueOf(ans);
                //System.out.println("n = " + n);
            }
            System.out.println("#" + i + " " + n);
            //sb.append("#"+i+" "+n).append('\n');
        }
        //System.out.println(sb);
    }

}
