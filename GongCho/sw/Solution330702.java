package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution330702 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] st = br.readLine().split(" ");
            int[] a = new int[n];
            for(int j=0; j<n; j++) {
                a[j] = Integer.parseInt(st[j]);
            }

            int[] dp = new int[n];
            dp[0] = 1;
            int max = 1;
            for(int next = 1; next < n; next++) {
                dp[next] = 1;
                for(int prev = 0; prev < next; prev++) {
                    if(a[prev] < a[next] && dp[prev] >= dp[next]) {
                        dp[next] = dp[prev] + 1;
                    }
                }
                max = Math.max(max, dp[next]);
            }
            System.out.println("#" + i + " " + max);
        }
    }

}

