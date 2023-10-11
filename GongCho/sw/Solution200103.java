package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution200103 {

    static int t, n, m;
    static int[][] a;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            String[] str = br.readLine().split(" ");
            n = Integer.parseInt(str[0]);
            m = Integer.parseInt(str[1]);
            a = new int[n][n];
            for(int j=0; j<n; j++) {
                str = br.readLine().split(" ");
                for(int k=0; k<n; k++) {
                    a[j][k] = Integer.parseInt(str[k]);
                }
            }

            int max = pro();
            System.out.println("#" + i + " " + max);
        }
    }

    public static int pro() {
        int max = 0;
        for(int k=0; k<n-m+1; k++) {
            for(int j=0; j<n-m+1; j++) {
                int sum = 0;
                for(int l=k; l<k+m; l++) {
                    for(int s=j; s<j+m; s++) {
                        sum += a[l][s];
                    }
                }
                max = Math.max(sum, max);
            }
        }
        return max;
    }

}

