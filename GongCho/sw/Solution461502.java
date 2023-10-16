package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
//~10:40 오셀로게임
//1이 흑돌, 2가 백돌
public class Solution461502 {

    static int t, bs, ws;
    static int[][] map;
    static int[][] dir = {{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,-1},{1,1}};
    static class dot {
        int x, y;

        public dot(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=t; i++) {
            sb.append("#"+i+" ");
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            map = new int[n+1][n+1];
            bs = 0;
            ws = 0;
            init(n);

            for(int j=0; j<m; j++) {
                str = br.readLine().split(" ");
                int x = Integer.parseInt(str[0]);
                int y = Integer.parseInt(str[1]);
                int s = Integer.parseInt(str[2]);
                place_stone(x,y,s,n);
            }
            sb.append(bs + " " + ws).append('\n');
        }
        System.out.println(sb);
    }

    static void place_stone(int x, int y, int s, int n) {
        for(int i=0; i<8; i++) {
            Queue<dot> q = new LinkedList<dot>();

            int nx = x + dir[i][0];
            int ny = y + dir[i][1];

            while(isOutOfArray(nx, ny, n)) {
                //자신이 놓으려고하는 돌의 색깔과 일치할경우
                if(map[nx][ny] == s) {
                    checkMap(q, s);
                    break;
                }
                //자신이 놓으려고하는 돌의 색깔과 반대일경우
                else if(map[nx][ny] != 0) {
                    q.add(new dot(nx,ny));
                } else {
                    break;
                }
                nx += dir[i][0];
                ny += dir[i][1];
            }
        }
        map[x][y] = s;
        if(s == 1) {
            bs += 1;
        } else {
            ws += 1;
        }
    }

    static void checkMap(Queue<dot> q, int s) {
        while(!q.isEmpty()) {
            dot d = q.poll();
            map[d.x][d.y] = s;
            if(s == 1) {
                bs += 1;
                ws -= 1;
            } else {
                bs -= 1;
                ws += 1;
            }
        }
    }

    static boolean isOutOfArray(int x, int y, int n) {
        if(x <= 0 || y <= 0 || x > n || y > n) {
            return false;
        }
        return true;
    }

    //1이 흑돌, 2가 백돌
    static void init(int n) {
        map[n/2][n/2] = 2;
        map[n/2 + 1][n/2 + 1] = 2;
        ws += 2;

        map[n/2][n/2 + 1] = 1;
        map[n/2 + 1][n/2] = 1;
        bs += 2;
    }
}
