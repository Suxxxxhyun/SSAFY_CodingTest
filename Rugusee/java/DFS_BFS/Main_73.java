package saffy.Rugusee.java.DFS_BFS;

import java.util.Scanner;

public class Main_73 {
    //순열구하기 - 중복안됨
    static int[] pm, ch, arr; //pm: 순열의 결과, ch: 방문 여부
    static int n, m;
    public void DFS(int L) {
        //순열 하나 완성
        if(L==m) {
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        }
        else {
            //ch의 i 인덱스가 쓰이지 않았을 때
            for(int i=0; i<n; i++) {
                if(ch[i] == 0) {
                    //방문 확인
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L+1);
                    //백하는 지점 - 방문 해제
                    ch[i] = 0;
                }
            }
        }

    }


    public static void main(String[] args) {
        Main_73 main = new Main_73();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        ch = new int[n];
        pm = new int[m];

        main.DFS(0);
    }
}
