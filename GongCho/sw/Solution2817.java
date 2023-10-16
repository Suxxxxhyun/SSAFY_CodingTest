package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2817 {

    static int t, n, k, ans = 0;
    static int[] arr;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            arr = new int[n];
            ans = 0;
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            pro(0,0);
            System.out.println("#" + i + " " + ans);
        }
    }

    static void pro(int idx, int sum) {
        if(idx == n) {
            if(sum == k) {
                ans += 1;
            }
            return;
        }

        pro(idx + 1, sum);
        pro(idx + 1, arr[idx] + sum);
    }

}

