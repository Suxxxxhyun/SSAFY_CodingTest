package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.GongCho.sw
 * fileName       : Solution195402
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-05        qkrtn_ulqpbq2       최초 생성
 */
public class Solution195402 {

    static int t, n;
    static int[][] a;
    static boolean[][] visited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            n = Integer.parseInt(br.readLine());
            a = new int[n][n];
            visited = new boolean[n][n];

            int dir = 0, x = 0, y = 0;
            for(int k=1; k<=n*n; k++){
                a[x][y] = k;
                visited[x][y] = true;

                int nextX = x + dx[dir], nextY = y + dy[dir];

                if(nextX >= n || nextY >= n || nextX < 0 || nextY < 0 || visited[nextX][nextY]){
                    dir = (dir + 1) % 4;
                }

                x = x + dx[dir];
                y = y + dy[dir];
            }

            sb.append("#" + i).append('\n');
            for(int k=0; k<n; k++){
                for(int j=0; j<n; j++){
                    sb.append(a[k][j] + " ");
                }
                sb.append('\n');
            }

        }
        System.out.println(sb);
    }
}
