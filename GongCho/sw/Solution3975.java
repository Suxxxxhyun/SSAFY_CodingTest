package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution3975 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            String[] st = br.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            int c = Integer.parseInt(st[2]);
            int d = Integer.parseInt(st[3]);

            double alice = (double) a / b;
            double bob = (double) c / d;
            //System.out.println(alice + "," + bob);
            if(alice == bob) {
                System.out.println("#" + i + " " + "DRAW");
            } else if(alice > bob) {
                System.out.println("#" + i + " " + "ALICE");
            } else {
                System.out.println("#" + i + " " + "BOB");
            }
        }
    }

}

