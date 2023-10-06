package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.GongCho.sw
 * fileName       : Solution1979
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-06        qkrtn_ulqpbq2       최초 생성
 */
public class Solution1979 {

    static int t, n, k, cnt;
    static int[][] map;
    static boolean[][] visited;
    static StringTokenizer st;
    static int[][][] direction = {{{0,-1},{0,1}},{{-1,0},{1,0}}};
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            map = new int[n][n];
            k = Integer.parseInt(st.nextToken());
            sb.append("#" + i + " ");
            cnt = 0;
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine(), " ");
                for(int l=0; l<n; l++){
                    map[j][l] = Integer.parseInt(st.nextToken());
                }
            }

            for(int k=0; k<2; k++){
                visited = new boolean[n][n];
                if(k == 0){
                    for(int j=0; j<n; j++){
                        for(int l=0; l<n; l++){
                            if(map[j][l] == 1){
                                if(pro(j,l,k)){
                                    cnt += 1;
                                };
                            }
                        }
                    }
                } else if(k == 1){
                    for(int j=0; j<n; j++){
                        for(int l=0; l<n; l++){
                            if(map[j][l] == 1){
                                if(pro(j,l,k)){
                                    cnt += 1;
                                };
                            }
                        }
                    }
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }

    static boolean pro(int x, int y, int z){
        for(int dir=0; dir<2; dir++){
            int num = 1;
            int xx = x, yy = y;
            visited[x][y] = true;
            while(true){

                int nx = xx + direction[z][dir][0];
                int ny = yy + direction[z][dir][1];

                if(nx < 0 || ny < 0 || nx >= n || ny >= n){
                    break;
                }

                if(map[nx][ny] == 0){
                    break;
                }

                if(visited[nx][ny]){
                    break;
                }

                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    num += 1;
                    xx = nx;
                    yy = ny;
                    visited[nx][ny] = true;
                }
            }
            if(num == k){
                return true;
            }
        }
        return false;
    }
}
