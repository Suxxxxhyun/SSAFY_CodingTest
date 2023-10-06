package saffy.DongHyun.bj.search;

// < 알고리즘 유형 >
// 그래프탐색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class _2667_단지번호붙이기 {

    static int N;

    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                int n = Character.getNumericValue(str.charAt(j));
                arr[i][j] = n;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j] == 1 && !visited[i][j]) {
                    int count = bfs(i,j);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);

        System.out.println(list.size());
        for(int x : list){
            System.out.println(x);
        }
    }
    static int bfs(int x, int y){
        int count = 1;
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y));
        visited[x][y] = true;

        while(!q.isEmpty()){
            Node node = q.poll();

            for(int i=0; i<4; i++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if(nx<0 || ny<0 || nx>=N || ny>=N){
                    continue;
                }
                if(visited[nx][ny] || arr[nx][ny] != 1){
                    continue;
                }
                q.offer(new Node(nx,ny));
                visited[nx][ny] = true;
                count++;
            }
        }
        return count;
    }

    static class Node{
        int x;
        int y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
