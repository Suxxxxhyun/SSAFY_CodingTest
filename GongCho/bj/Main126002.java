package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//ArrayList<ArrayList<Integer>>이걸로도 풀었다가 ArrayList<Integer>[] 이걸로도 풀어보자.
public class Main126002 {

    //방문할 정점이 여러개 인경우에는, 정점 번호가 낮은 것먼저 방문
    static StringTokenizer st;
    static int n, m, v; //정점, 간선, 시작할 정점의 번호
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i=1; i<=n; i++) {
            Collections.sort(graph.get(i));
        }

        visited = new boolean[n + 1];
        dfs(v);
        sb.append('\n');
        visited = new boolean[n + 1];
        bfs(v);
        System.out.println(sb);
    }

    static void bfs(int start) {
        visited[start] = true;
        sb.append(start + " ");
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);

        while(!q.isEmpty()) {
            int n = q.poll();
            for(int i=0; i<graph.get(n).size(); i++) {
                if(!visited[graph.get(n).get(i)]) {
                    visited[graph.get(n).get(i)] = true;
                    sb.append(graph.get(n).get(i) + " ");
                    q.add(graph.get(n).get(i));
                }
            }
        }
    }

    static void dfs(int start) {
        visited[start] = true;
        sb.append(start + " ");

        for(int i=0; i<graph.get(start).size(); i++) {
            if(!visited[graph.get(start).get(i)]) {
                dfs(graph.get(start).get(i));
            }
        }
    }

}

