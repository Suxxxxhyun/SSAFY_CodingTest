package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution5642 {

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

            int sum = 0, max = Integer.MIN_VALUE;
            for(int j=0; j<n; j++) {
                sum += a[j];
                if(sum > max) {
                    max = sum;
                }

                if(sum < 0) {
                    sum = 0;
                }
            }
            System.out.println("#" + i + " " + max);
        }
    }

}
