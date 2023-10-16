package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1217 {

    static int ans;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1; i<=10; i++) {
            int t = Integer.parseInt(br.readLine());
            System.out.print("#" + t + " ");
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            ans = 1;
            pro(n,m,1);
            System.out.print(ans);
            System.out.println();
        }

    }

    static void pro(int n, int m, int val) {
        if(m == 0) {
            ans = val;
            return;
        }

        pro(n, m - 1, val * n);
    }

}

