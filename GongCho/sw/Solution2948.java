package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution2948 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            String[] st = br.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            Set<String> str_1 = new HashSet<String>();
            st = br.readLine().split(" ");
            for(int j=0; j<a; j++) {
                str_1.add(st[j]);
            }

            Set<String> str_2 = new HashSet<String>();
            st = br.readLine().split(" ");
            for(int j=0; j<b; j++) {
                str_2.add(st[j]);
            }

            int ans = 0;
            Iterator<String> iter = str_1.iterator();
            while(iter.hasNext()) {
                String s = iter.next();
                if(str_2.contains(s)) {
                    ans += 1;
                }
            }

            System.out.println("#" + i + " " + ans);
        }
    }

}

