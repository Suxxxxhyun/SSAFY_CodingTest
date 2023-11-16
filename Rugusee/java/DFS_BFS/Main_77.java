package saffy.Rugusee.java.DFS_BFS;

import saffy.GongCho.tct.DFS;

import java.util.Scanner;

public class Main_77 {
    //미로 탐색: 미로를 탈출 할 수 있는 방법이 몇 개 있는지 찾기 
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = 0;

    public void DFS(int x, int y) {
        if (x == 7 && y == 7) answer++;
        else {
            //벽이 아니여서 전진할 수 있을 때, 1벽, 0벽아님
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                //가려는 방향이 경계선 안쪽에 있는지, 벽인지 아닌지 확인
                if(nx >= 1 && nx <= 7 && ny>=1 && ny<= 7 && board[nx][ny]==0) {
                    board[nx][ny] = 1; //방문한 지점 방문처리
                    DFS(nx, ny);
                    //x와 y가 7이 되면 back하고 0인 지점을 찾음
                    board[nx][ny] = 0;
                }
            }


        }
    }

    public static void main(String[] args) {
        Main_77 main = new Main_77();
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1;
        main.DFS(1, 1);
        System.out.println(answer);
    }
}
