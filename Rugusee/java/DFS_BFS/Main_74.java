package saffy.Rugusee.java.DFS_BFS;

import java.util.Scanner;

public class Main_74 {
    //조합의 경우수(메모이제이션): 재귀를 이용해 조합수를 구함
    //ex) dy[2][1]: 2C1 값을 구하는 것
    int[][] dy = new int[35][35]; //인스턴스 메서드만 접근하면 돼서 정적변수선언 안해도됨

    public int DFS (int n, int r) {
        if(dy[n][r] > 0) return dy[n][r]; //이미 구했는지 호가인
        if(n==r || r==0) return 1;
//        else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r); //콤비네이션 조합공식, 메모이제이션 안썼을 때
            //콤비네이션 조합공식, 메모이제이션 썼을 때, return할 때 이차원 배열에 값을 저장하고 이차원 배열 값으로 리턴해 줌
        else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }

    public static void main(String[] args) {
        Main_74 main = new Main_74();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(main.DFS(n, r));
    }
}
