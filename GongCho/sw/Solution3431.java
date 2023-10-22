package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution3431 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            String[] str = br.readLine().split(" ");
            //System.out.println("탔음");
            int L = Integer.parseInt(str[0]);
            int U = Integer.parseInt(str[1]);
            int X = Integer.parseInt(str[2]);
            //System.out.println(L + "," + U + "," + X);

            int ans = 0;
            if(X < L) {
                ans = L - X;
            } else if(X >= L && X <= U) {
                ans = 0;
            } else if(U > L){
                ans = -1;
            }
            System.out.println("#" + i + " " + ans);
        }
    }

}

