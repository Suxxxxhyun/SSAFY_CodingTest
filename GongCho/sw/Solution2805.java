package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2805 {

    static int t, n;
    static int[][] a;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            n = Integer.parseInt(br.readLine());
            a = new int[n][n];
            for(int j=0; j<n; j++) {
                String str = br.readLine();
                for(int k=0; k<n; k++) {
                    a[j][k] = str.charAt(k) - '0';
                }
            }

            int sum = 0, col = n/2, row = 0;
            for(int cnt=1; cnt<=n; cnt+=2) {
                int start = cnt, k = col;
                while(start-- > 0) {
                    sum += a[row][k--];
                }
                col += 1;
                row += 1;
            }
            //System.out.println(sum);
            //System.out.println(col);

            int col_2 = col - 2, row_2 = n / 2 + 1;
            for(int cnt=n-2; cnt>=1; cnt-=2) {
                int start = cnt, k=col_2;
                while(start-- > 0) {
                    sum += a[row_2][k--];
                }
                col_2 -=1;
                row_2 += 1;
            }
            System.out.println("#" + i + " " + sum);
        }
    }

}

