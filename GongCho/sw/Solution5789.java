package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution5789 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=t; i++) {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int q = Integer.parseInt(str[1]);
            int[] arr = new int[n+1];
            int ii = 1;
            for(int j=0; j<q; j++) {
                str = br.readLine().split(" ");
                int l = Integer.parseInt(str[0]);
                int r = Integer.parseInt(str[1]);
                for(int k=l; k<=r; k++) {
                    arr[k] = ii;
                }
                ii += 1;
            }

            sb.append("#" + i + " ");
            for(int j=1; j<=n; j++) {
                sb.append(arr[j] + " ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

}

