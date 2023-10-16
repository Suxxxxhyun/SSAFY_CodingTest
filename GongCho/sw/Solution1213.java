package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1213 {

    static int t, cnt;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1; i<=10; i++) {
            int t = Integer.parseInt(br.readLine());
            String str_1 = br.readLine();
            String str_2 = br.readLine();
            int str1_len = str_1.length();
            for(int j = 0; j < str_2.length() - str1_len + 1; j++) {
                String str = "";
                for(int k=j; k<str_1.length() + j; k++) {
                    str += str_2.charAt(k);
                }
                if(str.equals(str_1)) {
                    cnt += 1;
                }
            }
            sb.append("#" + i + " " + cnt).append('\n');
            cnt = 0;
        }
        System.out.println(sb);

    }

}

