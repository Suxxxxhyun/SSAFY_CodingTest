package saffy.Rugusee.java.DFS_BFS;

import java.util.Scanner;

public class Main_76 {
    static int n, m;
    static int[] combi;

    public void DFS(int L, int s) {
        //조합이 완성, 종착 지점
        if (L == m) {
            for(int x : combi) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for(int i=s; i<=n; i++) { //start num(1)부터
                //조합 외우기
                //i는 s ~ n까지 반복,
                combi[L]=i;
                DFS(L+1, i+1);
            }
        }

    }

    public static void main(String[] args) {
        Main_76 main = new Main_76();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        main.DFS(0, 1); //L:level, s: start num
    }
}
