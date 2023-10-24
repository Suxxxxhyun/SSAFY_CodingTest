package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution196102 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] a = new int[n][n];
            for(int j=0; j<n; j++) {
                String[] str = br.readLine().split(" ");
                for(int k=0; k<n; k++) {
                    a[j][k] = Integer.parseInt(str[k]);
                }
            }

            int[][] a_90 = rotate(a);
            int[][] a_180 = rotate(a_90);
            int[][] a_270 = rotate(a_180);

            System.out.println("#"+i);
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    System.out.print(a_90[j][k]);
                }
                System.out.print(" ");

                for(int k=0; k<n; k++) {
                    System.out.print(a_180[j][k]);
                }
                System.out.print(" ");

                for(int k=0; k<n; k++) {
                    System.out.print(a_270[j][k]);
                }
                System.out.println();
            }
        }
    }

    static int[][] rotate(int[][] a){
        int[][] k = new int[a.length][a.length];

        for(int j=0; j<a.length; j++) {
            for(int l=0; l<a.length; l++) {
                k[j][l] = a[a.length - l - 1][j];
            }
        }

        return k;
    }

}

