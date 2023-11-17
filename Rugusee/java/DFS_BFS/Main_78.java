package saffy.Rugusee.java.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    public int x, y;
    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main_78 {
    //미로 최단 경로 찾기
    //dis[nx][ny] = dis[x][y] + 1
    //범위 내에서 앞이랑 옆이랑 방문한 지점을 1로 바꾸고 뻗어나가며, 퍼져나가며 탐색
    static int[][] board, dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y)); //넘어온 좌표를 큐에 저장
        board[x][y] = 1; //방문확인

        while (!queue.isEmpty()) {
            Point tmp = queue.poll(); //기준점 좌표 꺼냄, 이 좌표를 기준으로 각 방향으로 뻗어 나감

            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];  //tmp.x: 현재 x
                int ny = tmp.y + dy[i];  //tmp.y: 현재 y

                //경계선 확인, 통로 확인
                if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1; //방문 후 벽처리
                    queue.offer(new Point(nx, ny)); //큐에 방문한 좌표 추가 후
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1; //현재 인덱스에서 목적지까지 인덱스의 값에 1을 더해 최단 경로 저장
                }
            }
        }

    }

    public static void main(String[] args) {
        Main_78 main = new Main_78();
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        main.BFS(1, 1); //출발점은 둘다 1
        if(dis[7][7] == 0) System.out.println(-1); //경로가 중간에 막혀 목적지까지 도착할 수 없으면 -1 출력
        else System.out.println(dis[7][7]); //목적지까지 도달 후 최단 경로를 찾았을 때

    }
}
