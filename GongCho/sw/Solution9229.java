package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution9229 {

    static int t, n, m, max;
    static int[] a;
    static Node[] selected;
    static StringBuilder sb = new StringBuilder();

    static class Node{
        int idx, height;

        public Node(int idx, int height) {
            this.idx = idx;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            a = new int[n];
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }

            max = -1;
            selected = new Node[2];
            pro(0);
            sb.append("#" + i + " ");
            if(max == -1) {
                sb.append(-1).append('\n');
            } else {
                sb.append(max).append('\n');
            }

        }
        System.out.println(sb);

    }

    static void pro(int idx) {
        if(idx == 2) {
            int sum = selected[0].height + selected[1].height;
            if(sum <= m) {
                max = Math.max(sum, max);
            }
            return;
        }

        int start;
        if(idx == 0) {
            start = 0;
        } else {
            start = selected[idx-1].idx + 1;
        }

        for(int i=start; i<n; i++) {
            selected[idx] = new Node(i,a[i]);
            pro(idx + 1);
        }
    }

}

