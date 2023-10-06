package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.GongCho.bj
 * fileName       : Main1012
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-06        qkrtn_ulqpbq2       최초 생성
 */
public class Main1012 {

    static int t, n, m, k, cnt = 0;
    static StringTokenizer st;
    static int[][] map;
    static boolean[][] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine(), " ");
            m = Integer.parseInt(st.nextToken()); //가로
            n = Integer.parseInt(st.nextToken()); //세로
            k = Integer.parseInt(st.nextToken());
            map = new int[n][m];
            visited = new boolean[n][m];
            for(int j=0; j<k; j++){
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }
            for(int l=0; l<n; l++){
                for(int u=0; u<m; u++){
                    if(dfs(l,u)){
                        cnt += 1;
                    }
                }
            }
            sb.append(cnt).append('\n');
            cnt = 0;
        }
        System.out.println(sb);
    }

    static boolean dfs(int x, int y){
        if(x < 0 || y < 0 || x >= n || y >= m){
            return false;
        }

        if(map[x][y] == 0){
            return false;
        }

        if(map[x][y] == 1 && !visited[x][y]){
            visited[x][y] = true;
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y - 1);
            dfs(x, y+1);
            return true;
        }
        return false;
    }
}
