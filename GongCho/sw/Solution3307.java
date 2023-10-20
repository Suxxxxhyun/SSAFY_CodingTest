package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution3307 {

    static int t, n;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            int[] dp = new int[n];
            String[] str = br.readLine().split(" ");
            for(int j=0; j<n; j++) {
                arr[j] = Integer.parseInt(str[j]);
            }

            dp[0] = 1;
            int max = 1;
            for(int next=1; next<n; next++) {
                dp[next] = 1;
                for(int prev=0; prev<next; prev++) {
                    if(arr[prev] < arr[next] && dp[prev] >= dp[next]) {
                        dp[next] = dp[prev] + 1;
                    }
                }
                max = Math.max(max, dp[next]);
            }
            System.out.println("#" + i + " " + max);
        }
    }

}