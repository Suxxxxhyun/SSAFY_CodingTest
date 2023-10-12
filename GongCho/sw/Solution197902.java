package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//8:30 ~ 9:00
//가로따로, 세로따로 생각하자.
public class Solution197902 {

    static int n, k, t, ga, se;
    static StringTokenizer st;
    static boolean[][] visited;
    static int[][] a;
    static int[][][] dir = {{{0,-1},{0,1}},{{-1,0},{1,0}}};

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            a = new int[n][n];
            for(int j=0; j<n; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int k=0; k<n; k++) {
                    a[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            ga = 0;
            se = 0;
            visited = new boolean[n][n];
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    if(a[j][k] == 1) {
                        ga += move(j,k,0);
                    }
                }
            }
            visited = new boolean[n][n];

            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    if(a[j][k] == 1) {
                        se += move(j,k,1);
                    }
                }
            }
            int sum = ga + se;
            System.out.println("#" + i + " " + sum);
        }
    }

    //(0,2)
    static int move(int x, int y, int j) {
        int count = 0;
        if(j == 0) {
            visited[x][y] = true;
            for(int l=0; l<2; l++) {
                int nx = x, ny = y;
                int cnt = 1; // 자릿수
                while(true) {
                    nx += dir[j][l][0];
                    ny += dir[j][l][1];

                    if(nx < 0 || ny < 0 || nx >= n || ny >= n) {
                        break;
                    }

                    if(a[nx][ny] == 0) {
                        break;
                    }

                    if(!visited[nx][ny]) {
                        cnt += 1;
                        visited[nx][ny] = true;
                    }
                }

                if(cnt == k) {
                    count += 1;
                }
            }
        } else if(j == 1){
            visited[x][y] = true;
            for(int l=0; l<2; l++) {
                int nx = x, ny = y;
                int cnt = 1; // 자릿수
                while(true) {
                    nx += dir[j][l][0];
                    ny += dir[j][l][1];

                    if(nx < 0 || ny < 0 || nx >= n || ny >= n) {
                        break;
                    }

                    if(a[nx][ny] == 0) {
                        break;
                    }

                    if(!visited[nx][ny]) {
                        cnt += 1;
                        visited[nx][ny] = true;
                    }
                }

                if(cnt == k) {
                    count += 1;
                }
            }
        }
        return count;
    }

}
