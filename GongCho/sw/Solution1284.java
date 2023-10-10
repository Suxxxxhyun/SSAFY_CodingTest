package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//P Q R S W
//9 100 20 3 10
//7:25 ~ 8:65

public class Solution1284 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int a = p * w;
            int b = 0;
            if(w > r) {
                b = q + (w - r) * s;
            } else {
                b = q;
            }
            //System.out.println("a = " + a + ", b = " + b);
            System.out.println("#" + i + " " + Math.min(a,b));
        }

    }

}

