package saffy.Rugusee.java.DFS_BFS;

import java.util.Scanner;

public class Main_75 {
    //이항 계수
    //순열을 하나 완성되면 곱해나가기
    //규칙 찾기
    //n=4, 3C0 * 3C1 * 3C2 * 3C3 / 1 * 3 * 3 *1
    //n=5, 4C0 * 4C1 * 4C2 * 4C3 * 4C3 * 4C4 / 1 * 4 * 6 * 4 * 1
    //sum + (P[L] * B[L]) -> 기존 sum에 새로운 값을 더하면서
    //새로운 sum으로 대입되고 sum의 값이 f와 같으면 종료
    static int[] b, p, ch;//b: 콤비네이션 값 저장 , p: 순열 저장 , ch: 방문 확인(중복 안됨)
    static int n, f;
    boolean flag = false; //답 찾으면 멈추기
    int[][] dy = new int[35][35];

    //조합 수 - 메모이제이션
    public int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }

    public void DFS(int L, int sum) {
        if(flag) return; //답을 발견하면 순열을 못만들게 막고 멈춤
        //n개중에서 n개 뽑은 순열이 하나 완성
        if (L == n) {
            //답 찾았을 때
            if(sum==f) {
                for(int x : p) System.out.print(x + " ");
                flag = true;
                System.out.println();
            }
        }
        //순열 만들기
        else {
            //i는 인덱스를 의미하지 않고 순열을 만드는 숫자이다
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1; //체크
                    p[L] = i; //i는 순열을 만드는 숫자, p는 순열을 만든 배열
                    DFS(L+1, sum + (p[L] * b[L])); //p[0] * b[0]...p[n] * b[n]
                    ch[i] = 0; //체크 해제
                }
            }

        }


    }

    public static void main(String[] args) {
        Main_75 main = new Main_75();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n + 1]; //i가 1부터 n번까지 필요해서
        for (int i = 0; i < n; i++) {
            b[i] = main.combi(n - 1, i);
        }

        main.DFS(0, 0);

    }
}
