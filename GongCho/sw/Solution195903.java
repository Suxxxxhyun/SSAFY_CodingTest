package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution195903 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            int[] a = new int[n];
            int[] b = new int[m];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<m; j++) {
                b[j] = Integer.parseInt(st.nextToken());
            }

            int max = 0;
            if(n > m) {
                for(int j=0; j<n - m + 1; j++) {
                    int sum = 0;
                    for(int k=0; k<m; k++) {
                        sum += b[k] * a[j+k];
                    }
                    max = Math.max(sum, max);
                }
            } else if(n < m) {
                for(int j=0; j<m - n + 1; j++) {
                    int sum = 0;
                    for(int k=0; k<n; k++) {
                        sum += b[j+k] * a[k];
                    }
                    max = Math.max(sum, max);
                }
            } else {
                int sum = 0;
                for(int j=0; j<n; j++) {
                    sum += a[j] * b[j];
                }
                max = Math.max(sum, max);
            }
            System.out.println("#" + i + " " + max);
        }

    }

}

