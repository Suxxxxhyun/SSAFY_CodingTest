package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main18870 {

    static int n;
    static class Num implements Comparable<Num>{
        int idx, n, rank;
        public Num(int idx, int n) {
            this.idx = idx;
            this.n = n;
        }

        public int compareTo(Num other) {
            return this.n - other.n;
        }

        public String toString() {
            return "idx= " + idx + ", n=" + n + " , rank=" + rank;
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        List<Num> list = new ArrayList<Num>();

        String[] str = br.readLine().split(" ");
        for(int i=0; i<n; i++) {
            int x = Integer.parseInt(str[i]);
            list.add(new Num(i,x));
        }

        Collections.sort(list);

        int idx = 0;
        Num node = list.get(0);
        node.rank = idx;

        for(int i=1; i<list.size(); i++) {
            Num no = list.get(i);
            if(node.n < no.n) {
                no.rank = ++idx;
            } else {
                no.rank = node.rank;
            }
            node = list.get(i);
        }

        //System.out.println(list);

        Collections.sort(list, new Comparator<Num>() {
            public int compare(Num o1, Num o2) {
                return o1.idx - o2.idx;
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++) {
            sb.append(list.get(i).rank + " ");
        }
        System.out.println(sb);
    }

}

