package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution1221 {

    static int t;
    static Map<String, Integer> maps;
    static String[] keys = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[1]);
            str = br.readLine().split(" ");
            maps = new HashMap<String, Integer>();
            for(int j=0; j<n; j++) {
                String key = str[j];
                maps.put(key, maps.getOrDefault(key, 0) + 1);
            }

            System.out.println("#" + i);
            for(int j=0; j<keys.length; j++) {
                int value = maps.get(keys[j]);
                for(int k=0; k<value; k++) {
                    System.out.print(keys[j] + " ");
                }
            }
            System.out.println();
        }
    }

}
