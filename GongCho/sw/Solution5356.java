package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution5356 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=t; i++) {
            sb.append("#"+i+" ");
            List<String> list = new ArrayList<String>();
            int max = 0;
            for(int j=0; j<5; j++) {
                String str = br.readLine();
                list.add(str);
                max = Math.max(str.length(), max);
            }

            String ans = "";
            for(int j=0; j<max; j++) {
                for(int k=0; k<list.size(); k++) {
                    if(list.get(k).length() > j) {
                        ans += list.get(k).charAt(j);
                    }
                }
            }
            sb.append(ans).append('\n');

        }
        System.out.println(sb);
    }

}

