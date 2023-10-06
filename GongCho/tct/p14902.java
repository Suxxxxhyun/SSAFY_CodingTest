package saffy.GongCho.tct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.GongCho.tct
 * fileName       : p14902
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-06        qkrtn_ulqpbq2       최초 생성
 */
public class p14902 {

    static int n,m;
    static StringTokenizer st;
    static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<m; j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }

        int result = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(dfs(i,j)){
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }

    static boolean dfs(int x, int y){
        if(x < 0 || y < 0 || x >= n || y >= m){
            return false;
        }

        if(map[x][y] == 0){
            map[x][y] = 1;
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }
}
