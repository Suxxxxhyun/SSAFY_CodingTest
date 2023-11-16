package saffy.Rugusee.java.recursive;

import java.util.Scanner;

public class Main_65 {
    //정점이 많으면 인접행렬을 사용하여 푸는 것이 메모리 절약을 할 수 있다
    //한번 방문한 노드를 다시 방문 하면 안된다
    //재귀함수는 방문한 노드를 항상 체크 해야한다
    //백트래킹: 앞전 지점으로 백하게 되면 방문했던 노드의 체크를 풀어야 된다
    static int n, m;
    static int answer = 0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v) {

        if(v==n) answer++;
        else {
            //1번 정점에서 갈 수 있는 i번 정점을(방문 하지 않은) 모두 찾아본다,.
            for(int i=1; i<=n; i++) {
                if(graph[v][i] == 1 && ch[i]==0) {
                    ch[i] = 1;
                    DFS(i); //v->i로 이동
                    ch[i] = 0; //백하는 시점에 방문 여부를 0으로 바꿔줌(방문 안한 경우로 변경)
                }
            }
        }
    }

    public static void main(String[] args) {
        Main_65 main = new Main_65();
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1; //방향 그래프
        }
        ch[1] = 1;
        main.DFS(1);
        System.out.println(answer);

    }
}
