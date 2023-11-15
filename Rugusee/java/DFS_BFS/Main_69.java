package saffy.Rugusee.java.DFS_BFS;

import java.util.Scanner;

public class Main_69 {
    //부분 집합과 유사
    //sum > c 커지면 바로 return
    static int answer = Integer.MIN_VALUE, c, n;

    public void DFS(int L, int sum, int[] arr) {
        if (sum > c) return;
        if (L == n) {
            //sum이 c보다 작거나 같은 부분집합이 됐다
            //부분집합의 합 중 최댓값
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }

    }

    public static void main(String[] args) {
        Main_69 main = new Main_69();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        main.DFS(0, 0, arr);
        System.out.println(answer);
    }

}
