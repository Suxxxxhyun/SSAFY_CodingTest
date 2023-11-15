package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution200105 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            String[] st = br.readLine().split(" ");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            int[][] map = new int[n][n];
            for(int j=0; j<n; j++) {
                st = br.readLine().split(" ");
                for(int k=0; k<n; k++) {
                    map[j][k] = Integer.parseInt(st[k]);
                }
            }

            int ans = 0;
            for(int row=0; row<=n-m; row++) {
                for(int col=0; col<=n-m; col++) {
                    int sum = 0;
                    for(int j=row; j<row+m; j++) {
                        for(int k=col; k<col+m; k++) {
                            sum += map[j][k];
                        }
                    }
                    ans = Math.max(sum, ans);
                }
            }
            System.out.println("#" + i + " " + ans);
        }
    }

}

