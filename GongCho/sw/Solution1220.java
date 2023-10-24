package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1220 {

    static int n;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1; i<=10; i++) {
            n = Integer.parseInt(br.readLine());
            int[][] a = new int[n][n];
            for(int j=0; j<n; j++) {
                String[] st = br.readLine().split(" ");
                for(int k=0; k<n; k++) {
                    a[j][k] = Integer.parseInt(st[k]);
                }
            }

            int sum = 0;
            for(int col=0; col<100; col++) {
                int last = 0;
                for(int row=0; row<100; row++) {
                    if(a[row][col] == 1) {
                        last = 1;
                    } else if(a[row][col] == 2) {
                        if(last == 1) {
                            sum++;
                        }
                        last = 2;
                    }
                }
            }
            System.out.println("#"+i+" "+sum);
        }

    }

}

