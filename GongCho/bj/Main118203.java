package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main118203 {

    static int n, s, ans;
    static int[] a;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        a = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        pro(0, 0);
        System.out.println(s == 0 ? ans - 1 : ans);
    }

    static void pro(int idx, int sum) {
        if(idx == n) {
            if(sum == s) {
                ans += 1;
            }
            return;
        }

        pro(idx + 1, sum);
        pro(idx + 1, sum + a[idx]);
    }

}

