package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution200104 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            int[][] map = new int[n][n];
            for(int j=0; j<n; j++) {
                str = br.readLine().split(" ");
                for(int k=0; k<n; k++) {
                    map[j][k] = Integer.parseInt(str[k]);
                }
            }

            int max = 0;
            for(int j=0; j<n-m+1; j++) {
                for(int k=0; k<n-m+1; k++) {
                    int sum = 0;
                    for(int row=j; row<j+m; row++) {
                        for(int col=k; col<k+m; col++) {
                            sum += map[row][col];
                        }
                    }
                    max = Math.max(sum, max);
                }
            }
            System.out.println("#"+i+" "+max);
        }

    }

}
