package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution5431 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            str = br.readLine().split(" ");
            int[] a = new int[k];
            Set<Integer> s = new HashSet<Integer>();
            for(int j=0; j<k; j++) {
                a[j] = Integer.parseInt(str[j]);
                s.add(a[j]);
            }
            List<Integer> list = new ArrayList<Integer>();
            for(int j=1; j<=n; j++) {
                if(s.contains(j)) {
                    continue;
                }
                list.add(j);
            }
            Collections.sort(list);
            System.out.print("#" + i + " ");
            for(int j=0; j<list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println();
        }
    }

}

