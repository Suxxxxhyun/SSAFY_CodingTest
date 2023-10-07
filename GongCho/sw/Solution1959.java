package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1959 {

    static int t;
    static StringTokenizer st;
    static int[] a, b;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            a = new int[n];
            b = new int[m];
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<m; j++) {
                b[j] = Integer.parseInt(st.nextToken());
            }
            int sum = 0, max = Integer.MIN_VALUE;
            if(a.length >= b.length) {
                int init_a_start = 0;
                int a_start = init_a_start;
                int range = n - m;

                while(range-- >= 0) {
                    for(int k=0; k<m; k++) {
                        sum += a[a_start++] * b[k];
                    }
                    init_a_start += 1;
                    a_start = init_a_start;
                    max = Math.max(sum, max);
                    sum = 0;
                }
            } else {
                int init_b_start = 0;
                int b_start = init_b_start;
                int range = m - n;

                while(range-- >= 0) {
                    for(int k=0; k<n; k++) {
                        sum += a[k] * b[b_start++];
                    }
                    init_b_start += 1;
                    b_start = init_b_start;
                    max = Math.max(sum, max);
                    sum = 0;
                }

            }
            sb.append("#" + i + " ").append(max).append('\n');
        }
        System.out.println(sb);

    }

}
