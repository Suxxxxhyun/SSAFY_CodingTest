package saffy.GongCho.tct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.GongCho.tct
 * fileName       : p15202
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-06        qkrtn_ulqpbq2       최초 생성
 */
public class p15202 {

    static int n,m;
    static StringTokenizer st;
    static int[][] map;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static class Node{
        int x, y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int getX(){
            return this.x;
        }

        public int getY(){
            return this.y;
        }
    }
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
        System.out.println(bfs(0,0));
    }

    static int bfs(int x, int y){
        Queue<Node> q = new LinkedList<Node>();
        q.offer(new Node(x,y));
        while(!q.isEmpty()){
            Node node = q.poll();
            x = node.getX();
            y = node.getY();

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= m){
                    continue;
                }

                if(map[nx][ny] == 0){
                    continue;
                }

                if(map[nx][ny] == 1){
                    q.offer(new Node(nx, ny));
                    map[nx][ny] = map[x][y] + 1;
                }
            }
        }
        return map[n - 1][m - 1];
    }
}
