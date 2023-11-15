package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution2814 {

    static int t, answer;
    static boolean[] visited;
    static List<ArrayList<Integer>> graph;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            String[] st = br.readLine().split(" ");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);

            graph = new ArrayList<ArrayList<Integer>>();
            for(int j=0; j<=n; j++) {
                graph.add(new ArrayList<Integer>());
            }

            visited = new boolean[n+1];
            answer = 0;
            for(int j=0; j<m; j++) {
                st = br.readLine().split(" ");
                int a = Integer.parseInt(st[0]);
                int b = Integer.parseInt(st[1]);
                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            for(int j=1; j<=n; j++) {
                dfs(j, 1);
                visited = new boolean[n+1];
            }
            System.out.println("#" + i + " " + answer);
        }
    }

    static void dfs(int start, int cost) {
        visited[start] = true;

        List<Integer> list = graph.get(start);
        for(int j=0; j<list.size(); j++) {
            if(!visited[list.get(j)]) {
                dfs(list.get(j), cost + 1);
                visited[list.get(j)] = false;
            }
        }
        answer = Math.max(answer, cost);
    }

}

