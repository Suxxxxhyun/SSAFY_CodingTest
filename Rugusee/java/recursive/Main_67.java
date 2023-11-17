package saffy.Rugusee.java.recursive;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_67 {
//        6 9
//        1 3
//        1 4
//        2 1
//        2 5
//        3 4
//        4 5
//        4 6
//        6 2
//        6 5
    //각 정점으로 가는 최소 이동 간선 수
    //경로 탐색 - DFS <-> 최단 거리: BFS
    // v: 현재 정점 -> nv: 다음 정점 : dis[nv] = dis[v]: v까지 가는 최소 거리 + 1
    //dis: 0 3 1 1 2 2 (1|2|3|4|5|6)
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1; //방문확인
        dis[v] = 0; //출발지점
        queue.offer(v); //1번 정점 추가

        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1; //2차원 최단 거리는 이런 식으로 푼다
                }

            }

        }

    }

    public static void main(String[] args) {
        Main_67 main = new Main_67();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); //정점의 개수
        m = sc.nextInt(); //간선의 개수

        //객체 생성까지 인접리스트 생성
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>()); //integer를 저장할 수 있는 동적 배열을 저장하는 동적 배열
        }
        ch = new int[n + 1];
        dis = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b); //3: - 5(add) - 6(add)
        }

        main.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
