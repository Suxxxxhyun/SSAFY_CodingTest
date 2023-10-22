package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//string에서는 contains메서드가 존재한다!
//B O X
//B X X
//B X O
//B O O
public class Solution7272 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        String nothing = "CEFGHIJKLMNSTUVWXYZ";
        String g1 = "ADOPQR";
        String g2 = "B";
        String nothing_space = "0";

        for(int i=1; i<=t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String x = st.nextToken();
            String y = st.nextToken();
            int x_len = x.length();
            int y_len = y.length();
            int max = Math.max(x_len, y_len);
            boolean same = true;

            for(int j=0; j<max; j++) {
                String xx = "", yy = "";
                int x_g = 0, y_g = 0;
                if(j < x_len) {
                    xx = x.charAt(j) + "";
                } else {
                    xx = nothing_space;
                }
                if(j < y_len) {
                    yy = y.charAt(j) + "";
                } else {
                    yy = nothing_space;
                }

                if(nothing.contains(xx)) {
                    x_g = 1;
                } else if(g1.contains(xx)) {
                    x_g = 2;
                } else if(g2.contains(xx)){
                    x_g = 3;
                }

                if(nothing.contains(yy)) {
                    y_g = 1;
                } else if(g1.contains(yy)) {
                    y_g = 2;
                } else if(g2.contains(yy)){
                    y_g = 3;
                }

                if(x_g != y_g) {
                    same = false;
                    System.out.println("#" + i + " " + "DIFF");
                    break;
                }
            }
            if(same) {
                System.out.println("#" + i + " " + "SAME");
            }
        }
    }

}

