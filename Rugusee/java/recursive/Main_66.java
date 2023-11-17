package saffy.Rugusee.java.recursive;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_66 {
//            5 9
//            1 2
//            1 3
//            1 4
//            2 1
//            2 3
//            2 5
//            3 4
//            4 2
//            4 5
    //1: - 2 - 3 - 4
    //2: - 1 - 3
    //3: - 4
    //4: - 2 - 5
    //5:
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public void DFS(int v) {
        if(v==n) answer++;
        else {
            //해당노드의 인접한 노드를 찾아 방문했으면 확인 후 해제
            for(int nv : graph.get(v)) {
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main_66 main = new Main_66();
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>()); //integer를 저장할 수 있는 동적 배열을 저장하는 동적 배열
        }
        ch = new int[n+1];
        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b); //3: - 5(add) - 6(add)
        }
        ch[1] = 1;
        main.DFS(1);
        System.out.println(answer);
    }
}
