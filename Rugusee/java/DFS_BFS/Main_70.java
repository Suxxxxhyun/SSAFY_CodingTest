package saffy.Rugusee.java.DFS_BFS;

import saffy.GongCho.tct.DFS;

import java.util.Scanner;

public class Main_70 {
    static int n, m;
    static int answer = Integer.MIN_VALUE;

    //sum: 푼 다고 가정한 문제 들의 합, 얻을 수 있는 점수
    //time: 풀었을 때 걸리는 시간
    public void DFS (int L, int sum, int time, int[] ps, int[] pt) {
        if(time > m) return;
        if(L==n) {
            //푸는 조합의 부분 집합이 하나 완성
            answer = Math.max(answer, sum);
        }
        else {
            DFS(L+1, sum + ps[L], time + pt[L], ps, pt);
            DFS(L+1, sum, time, ps, pt);
        }

    }

    public static void main(String[] args) {
        Main_70 main = new Main_70();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[] a = new int[n]; //점수
        int[] b = new int[n]; //걸리는 시간

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        main.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }
}
