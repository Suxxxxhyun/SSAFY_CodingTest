package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * packageName    : saffy.GongCho.bj
 * fileName       : Main2667
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-06        qkrtn_ulqpbq2       최초 생성
 */
public class Main2667 {

    static int n,cnt = 0;
    static int[][] map;
    static boolean[][] visited;
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<n; j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }

        int result = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(dfs(i,j)){
                   result += 1;
                   list.add(cnt);
                    cnt = 0;
                }
            }
        }
        Collections.sort(list);
        sb.append(result).append('\n');
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i)).append('\n');
        }
        System.out.println(sb);
    }

    static boolean dfs(int x, int y){
        if(x < 0 || y < 0 || x >= n || y >= n){
            return false;
        }

        if(map[x][y] == 0){
            return false;
        }

        if(map[x][y] == 1 && !visited[x][y]){
            visited[x][y] = true;
            cnt += 1;
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y-1);
            dfs(x, y+1);
            return true;
        }
        return false;
    }
}
