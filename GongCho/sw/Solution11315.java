package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution11315 {

    static int t;
    static int[][] dir = {{0,1},{1,0},{1,1},{1,-1}};

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            int n = Integer.parseInt(br.readLine());
            char[][] map = new char[n][n];
            for(int j=0; j<n; j++) {
                String str = br.readLine();
                for(int k=0; k<n; k++) {
                    map[j][k] = str.charAt(k);
                }
            }

            String ans = "NO";
            game:for(int row=0; row<n; row++) {
                for(int col=0; col<n; col++) {
                    if(map[row][col] == 'o') {
                        int count = 0;
                        for(int direction=0; direction<4; direction++) {
                            int nx = row + dir[direction][0];
                            int ny = col + dir[direction][1];
                            int k = 1;
                            while(nx >= 0 && ny >= 0 && nx < n && ny < n && map[nx][ny] == 'o') {
                                nx += dir[direction][0];
                                ny += dir[direction][1];
                                k++;
                            }
                            count = Math.max(count, k);
                            if(count >= 5) {
                                ans = "YES";
                                break game;
                            }
                        }
                    }
                }
            }
            System.out.println("#"+i+" "+ans);
        }

    }

}

