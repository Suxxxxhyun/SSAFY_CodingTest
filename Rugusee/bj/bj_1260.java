package saffy.Rugusee.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//231005 - 1260, 9663, 14888
public class bj_1260 {
    static int[][] graph; //n+1만큼 배열 생성
    static boolean[] visited; //n+1만큼 배열 생성

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //정점의 개수
        int m = Integer.parseInt(st.nextToken()); //간선의 개수
        int v = Integer.parseInt(st.nextToken()); //탐색을 시작할 정점의 번호

        graph = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            //연결된 노드를 1로 세팅
            graph[x][y] = graph[y][x] = 1;

        }

        //노드가 1부터 시작하기 때문에 n+1
        visited = new boolean[n + 1];
        dfs(v);
        System.out.println();
        visited = new boolean[n + 1];
        bfs(v);

    }

    static void dfs(int node) {
        //시작점을 변수로 받아 확인 후 출력
        visited[node] = true;
        System.out.print(node + " ");

        //방문한 노드면 바로 return
        if (node == graph.length) return;

        for (int i = 1; i < graph.length; i++) {
            //방문하지 않고 인접한 노드를 찾아서 재귀호출
            if (graph[node][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }

    }

    static void bfs(int node) {
        //다음 방문할 노드들을 저장한다
        Queue<Integer> queue = new LinkedList<>();
        //방문해야할 노드를 큐에 넣어준다
        queue.add(node);
        //처음 node는 방문체크를 안했으니 무조건 방문체크를 한다
        visited[node] = true;

        //방문할 노드가 없을 때까지 반복
        while (!queue.isEmpty()) {
            //방문할 노드를 꺼내고 값을 반환
            node = queue.poll();
            System.out.print(node + " ");

            //노드 하나로 연결된 노드를 먼저 다 체크한다
            for (int i = 1; i < graph.length; i++) {
                //방문하지 않고 인접한 노드를 찾아서 queue에 추가
                if (graph[node][i] == 1 && !visited[i]) {
                    //다음 방문을 위해 queue에 추가
                    queue.add(i);
                    //다음 방문 때 방문체크
                    visited[i] = true;

                }
            }
        }
    }

}
