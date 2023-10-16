package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1216 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1; i<=10; i++) {
            int n = Integer.parseInt(br.readLine());
            char[][] map = new char[100][100];
            for(int j=0; j<100; j++) {
                String[] str = br.readLine().split("");
                for(int k=0; k<100; k++) {
                    map[j][k] = str[k].charAt(0);
                }
            }

            //가로
            int max_ga_sum = 0;
            for(int row=0; row<100; row++) {
                int len = 0;
                int max_ga = 0;
                for(int k=0; k<100; k++) {
                    StringBuilder sb = new StringBuilder();
                    for(int col=k; col<100; col++) {
                        sb.append(map[row][col]);
                        String st = sb.toString();
                        String str = sb.reverse().toString();
                        sb.reverse();
                        if(st.equals(str.toString())) {
                            len = sb.length();
                        }
                    }
                    max_ga = Math.max(len, max_ga);
                }
                max_ga_sum = Math.max(max_ga, max_ga_sum);
            }
            //세로
            int max_se_sum = 0;
            for(int col = 0; col < 100; col++) {
                int len = 0;
                int max_se = 0;
                for(int k=0; k<100; k++) {
                    StringBuilder sb = new StringBuilder();
                    for(int row = k; row < 100; row++) {
                        sb.append(map[row][col]);
                        String st = sb.toString();
                        String str = sb.reverse().toString();
                        sb.reverse();
                        if(st.equals(str.toString())) {
                            len = sb.length();
                        }
                    }
                    max_se = Math.max(len, max_se);
                }
                max_se_sum = Math.max(max_se, max_se_sum);
            }
            int max = Math.max(max_ga_sum, max_se_sum);
            System.out.println("#" + i + " " + max);
        }
    }

}

