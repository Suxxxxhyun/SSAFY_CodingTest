package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution4615 {

    static int t, wc = 0, bc = 0;
    static class Node{
        int y, x;
        public Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            sb.append("#").append(i).append(" ");

            wc = 0;
            bc = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] map = new int[n+1][n+1];

            init(map, n);

            for(int j=0; j<m; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                placeStone(map, n, y, x, c);
            }
            sb.append(bc).append(" ").append(wc).append("\n");
        }
        System.out.println(sb);

    }

    static void placeStone(int[][] map, int n, int y, int x, int c) {
        int dy[] = {-1,1,0,0,-1,-1,1,1};
        int dx[] = {0,0,-1,1,-1,1,-1,1};


        //1. 위 - (0,2)
        //2. 아래 - (2,2)
        //3. 왼쪽
        //4. 오른쪽
        //5. 왼쪽 위 대각선
        //6. 오른쪽 위 대각선
        //7. 왼쪽 아래 대각선
        //8. 오른쪽 아래 대각선


        for(int i=0; i<8; i++) {
            Queue<Node> q = new LinkedList<>();
            int ny = y + dy[i];
            int nx = x + dx[i];

            while(!isOutOfArray(ny, nx, n)) {
                if(map[ny][nx] == c) {
                    checkMap(q, map, c);
                    break;
                } else if(map[ny][nx] != 0) {
                    q.add(new Node(ny, nx));
                } else {
                    break;
                }
                ny += dy[i];
                nx += dx[i];
            }
        }
        map[y][x] = c;
        if(c == 1) {
            bc += 1;
        } else {
            wc += 1;
        }
    }

    static void checkMap(Queue<Node> q, int[][] map, int c) {
        while(!q.isEmpty()) {
            Node n = q.poll();
            map[n.y][n.x] = c;
            if(c == 1) {
                bc += 1;
                wc -= 1;
            } else {
                bc -= 1;
                wc += 1;
            }
        }
    }

    static boolean isOutOfArray(int y, int x, int n) {
        if(y <= 0 || x <= 0 || y > n || x > n) {
            return true;
        }
        return false;
    }

    static void init(int[][] map, int n) {
        map[n/2][n/2] = 2;
        map[n/2 + 1][n/2 + 1] = 2;
        wc += 2;

        map[n/2][n/2 + 1] = 1;
        map[n/2 + 1][n/2] = 1;
        bc += 2;
    }

}

