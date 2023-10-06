package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.GongCho.sw
 * fileName       : Solution195404
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-06        qkrtn_ulqpbq2       최초 생성
 */
//11:53 ~ 12:27
public class Solution195404 {

    static int t, n;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            n = Integer.parseInt(br.readLine());
            map = new int[n][n];
            visited = new boolean[n][n];
            int dir = 0, x = 0, y = 0;
            for(int k=1; k<=n*n; k++){
                map[x][y] = k;
                visited[x][y] = true;
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if(nx < 0 || ny < 0 || nx >= n || ny >= n || visited[nx][ny]){
                    dir = (dir + 1) % 4;
                }

                x = x + dx[dir];
                y = y + dy[dir];
            }

            sb.append("#" + i).append('\n');
            for(int k=0; k<n; k++){
                for(int l=0; l<n; l++){
                    sb.append(map[k][l] + " ");
                }
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }
}
