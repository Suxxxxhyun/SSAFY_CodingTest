package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution128502 {

    static int t;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            int[] a = new int[n];
            for(int j=0; j<n; j++) {
                a[j] = Math.abs(Integer.parseInt(str[j]));
            }
            Arrays.sort(a);
            int cnt = 1;
            for(int j=1; j<n; j++) {
                if(a[j] > a[j-1]) {
                    break;
                }
                cnt += 1;
            }
            sb.append("#" + i + " ").append(a[0] + " " + cnt).append('\n');
        }
        System.out.println(sb);
    }

}

