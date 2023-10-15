package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1289 {

    static int t, ans;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            String st = br.readLine();
            ans = 0;
            func('0', 0, st);
            System.out.println("#" + i + " " + ans);
        }

    }

    static void func(char now, int cnt, String str) {
        if(cnt == str.length()) {
            return;
        }

        if(str.charAt(cnt) != now) {
            if(now == '0') {
                now = '1';
            } else {
                now = '0';
            }
            ans += 1;
        }

        func(now, cnt + 1, str);
    }

}

