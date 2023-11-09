package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//ArrayList<Integer>[] 이걸로도 풀어보자.
public class Main126003 {

    //방문할 정점이 여러개 인경우에는, 정점 번호가 낮은 것먼저 방문
    static StringTokenizer st;
    static int n, m, v; //정점, 간선, 시작할 정점의 번호
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        graph = new ArrayList[n + 1];
        for(int i=1; i<=n; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        for(int i=1; i<=n; i++) {
            Collections.sort(graph[i]);
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
            for(int i=0; i<graph[n].size(); i++) {
                if(!visited[graph[n].get(i)]) {
                    visited[graph[n].get(i)] = true;
                    sb.append(graph[n].get(i) + " ");
                    q.add(graph[n].get(i));
                }
            }
        }
    }

    static void dfs(int start) {
        visited[start] = true;
        sb.append(start + " ");

        for(int i=0; i<graph[start].size(); i++) {
            if(!visited[graph[start].get(i)]) {
                dfs(graph[start].get(i));
            }
        }
    }

}

