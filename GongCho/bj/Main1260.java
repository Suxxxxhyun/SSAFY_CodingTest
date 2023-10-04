package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * packageName    : saffy.GongCho.bj
 * fileName       : Main1260
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-05        qkrtn_ulqpbq2       최초 생성
 */
public class Main1260 {

    static int n, m, v;
    static StringTokenizer st;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        for(int i=0; i<n+1; i++){
            graph.add(new ArrayList<Integer>());
        }
        visited = new boolean[n+1];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i=1; i<=n; i++){
            Collections.sort(graph.get(i));
        }

        dfs(v);
        sb.append('\n');
        visited = new boolean[n+1];
        bfs(v);
        System.out.println(sb);
    }

    static void dfs(int start){
        visited[start] = true;
        sb.append(start + " ");
        for(int i=0; i<graph.get(start).size(); i++){
            int x = graph.get(start).get(i);
            if(!visited[x]){
                dfs(x);
            }
        }
    }

    static void bfs(int start){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int x = q.poll();
            sb.append(x + " ");
            for(int i=0; i<graph.get(x).size(); i++){
                int y = graph.get(x).get(i);
                if(!visited[y]){
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }
    }
}
