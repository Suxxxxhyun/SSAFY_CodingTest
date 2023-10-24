package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1240 {

    static int n,m,t;
    static String[] code_a = {"0001101", "0011001", "0010011", "0111101", "0100011", "0110001",
            "0101111", "0111011", "0110111","0001011"};

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            String[] str = br.readLine().split(" ");
            n = Integer.parseInt(str[0]);
            m = Integer.parseInt(str[1]);
            String[] map = new String[n];
            for(int j=0; j<n; j++) {
                map[j] = br.readLine();
            }

            String code = "";
            for(int j=0; j<n; j++) {
                for(int k=m-1; k>=0; k--) {
                    if(map[j].charAt(k) - '0' == 1) {
                        code = map[j].substring(k-55, k+1);
                        break;
                    }
                }
            }

            //System.out.println(code + "," + code.length());

            String a = "";
            for(int j=0; j<code.length(); j+=7) {
                String st = code.substring(j, j+7);
                for(int k=0; k<code_a.length; k++) {
                    if(st.equals(code_a[k])) {
                        a += k;
                    }
                }
            }

            //System.out.println(a);

            int sum_1 = 0, sum_0 = 0;
            int ans = 0;
            for(int j=0; j<a.length(); j++) {
                int val = a.charAt(j) - '0';
                if(j % 2 == 0) {
                    sum_0 +=  val;
                } else {
                    sum_1 += val;
                }
                ans += val;
            }

            int sum = sum_0 * 3 + sum_1;
            if(sum % 10 == 0) {
                System.out.println("#"+i+" "+ans);
            } else {
                System.out.println("#"+i+" "+0);
            }
        }

    }

}


