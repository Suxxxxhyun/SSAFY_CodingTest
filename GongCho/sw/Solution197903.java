package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution197903 {

    static int t, ans;
    static int[][] dir = {{0,1},{1,0}};

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            int[][] map = new int[n][n];
            for(int j=0; j<n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                for(int k=0; k<n; k++) {
                    map[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            ans = 0;
            boolean[][] visited = new boolean[n][n];
            for(int j=0; j<2; j++) {
                for(int row=0; row<n; row++) {
                    for(int col=0; col<n; col++) {
                        if(map[row][col] == 1 && !visited[row][col]) {
                            pro(n,m,map,j,row,col, visited);
                        }
                    }
                }
                visited = new boolean[n][n];
                //System.out.println("ans = " + ans);
            }
            System.out.println("#"+i+" "+ans);
        }
    }

    static void pro(int n, int m, int[][] map, int j, int row, int col, boolean[][] visited) {
        //j가 0이면, 왼쪽, 오른쪽 방향을 확인
        if(j == 0) {
            int x = row, y = col;
            visited[x][y] = true;
            int count = 1;
            while(true) {
                int nx = x + dir[0][0];
                int ny = y + dir[0][1];

                if(nx < 0 || ny < 0 || nx >= n || ny >= n || map[nx][ny] == 0) {
                    break;
                }

                if(map[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    count += 1;
                    x = nx;
                    y = ny;
                }
            }

            if(count == m) {
                ans += 1;
            }
        } else {
            int x = row, y = col;
            visited[x][y] = true;
            int count = 1;
            while(true) {
                int nx = x + dir[1][0];
                int ny = y + dir[1][1];

                if(nx < 0 || ny < 0 || nx >= n || ny >= n || map[nx][ny] == 0) {
                    break;
                }

                if(map[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    count += 1;
                    x = nx;
                    y = ny;
                }
            }

            if(count == m) {
                ans += 1;
            }
        }
    }

}

