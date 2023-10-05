package saffy.DongHyun.bj.search;

// < 알고리즘 유형 >
// 그래프탐색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1012_유기농_배추 {

    static int M,N;
    static int[][] arr;
    static boolean[][] visited;

    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            arr = new int[N][M];
            visited = new boolean[N][M];

            for(int i=0; i<K; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[b][a] = 1;
            }

            int count = 0 ;
            for(int i=0; i<N; i++){
                for(int j=0;j<M;j++){
                    if(arr[i][j] == 1 && !visited[i][j]){
                        bfs(i,j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    static void bfs(int x,int y){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y));
        visited[x][y] = true;

        while(!q.isEmpty()){
            Node node = q.poll();

            for(int i=0; i<4; i++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if(nx<0 || ny<0 || nx>=N || ny>=M){
                    continue;
                }
                if(arr[nx][ny] != 1 || visited[nx][ny]){
                    continue;
                }
                q.offer(new Node(nx,ny));
                visited[nx][ny] = true;
            }
        }
    }
    static class Node{
        int x;
        int y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
