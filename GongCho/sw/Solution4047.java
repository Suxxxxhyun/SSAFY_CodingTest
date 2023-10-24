package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution4047 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        for(int i=1; i<=t; i++) {
            int[] s = new int[14];
            int[] d = new int[14];
            int[] h = new int[14];
            int[] c = new int[14];

            Arrays.fill(s, 1);
            Arrays.fill(d, 1);
            Arrays.fill(h, 1);
            Arrays.fill(c, 1);
            boolean error = false;
            String str = br.readLine();
            for(int j=0; j<str.length(); j+=3) {
                int num = 0;
                if(str.charAt(j) == 'S') {
                    num = (str.charAt(j+1) - '0') * 10 + str.charAt(j+2) - '0';
                    if(s[num] > 0) {
                        s[num]--;
                    } else {
                        error = true;
                        System.out.println("#" + i + " " + "ERROR");
                        break;
                    }
                } else if(str.charAt(j) == 'D') {
                    num = (str.charAt(j+1) - '0') * 10 + str.charAt(j+2) - '0';
                    if(d[num] > 0) {
                        d[num]--;
                    } else {
                        error = true;
                        System.out.println("#" + i + " " + "ERROR");
                        break;
                    }
                } else if(str.charAt(j) == 'H') {
                    num = (str.charAt(j+1) - '0') * 10 + str.charAt(j+2) - '0';
                    if(h[num] > 0) {
                        h[num]--;
                    } else {
                        error = true;
                        System.out.println("#" + i + " " + "ERROR");
                        break;
                    }
                } else if(str.charAt(j) == 'C') {
                    num = (str.charAt(j+1) - '0') * 10 + str.charAt(j+2) - '0';
                    if(c[num] > 0) {
                        c[num]--;
                    } else {
                        error = true;
                        System.out.println("#" + i + " " + "ERROR");
                        break;
                    }
                }
            }


            if(!error) {
                int s_sum = 0, d_sum = 0, h_sum = 0, c_sum = 0;
                for(int j=1; j <= 13; j++) {
                    s_sum += s[j];
                    d_sum += d[j];
                    h_sum += h[j];
                    c_sum += c[j];
                }
//				int s_ans = 13 - s_sum;
//				int d_ans = 13 - d_sum;
//				int h_ans = 13 - h_sum;
//				int c_ans = 13 - c_sum;
                System.out.println("#" + i + " " + s_sum + " " + d_sum + " " + h_sum + " " + c_sum);
            }
        }
    }

}

