package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//~9:07
public class Solution1873 {

    static int t, direction, len, startX, startY;
    static StringTokenizer st;
    static int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    static char[] direc = {'>','<','v','^'};

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            char[][] map = new char[h][w];
            for(int a=0; a<h; a++) {
                String str = br.readLine();
                for(int b=0; b<w; b++) {
                    map[a][b] = str.charAt(b);
                    if(map[a][b] == '<') {
                        direction = 1;
                        startX = a;
                        startY = b;
                    } else if(map[a][b] == '>') {
                        direction = 0;
                        startX = a;
                        startY = b;
                    } else if(map[a][b] == '^') {
                        direction = 3;
                        startX = a;
                        startY = b;
                    } else if(map[a][b] == 'v'){
                        direction = 2;
                        startX = a;
                        startY = b;
                    }
                }
            }
            len = Integer.parseInt(br.readLine());
            String pr = br.readLine();
            //System.out.println("direction = " + direction + ", startX = " + startX + ", startY = " + startY);
            pro(pr, map, h, w, i);
        }
    }

    //startX - 2
    //startY - 1
    static void pro(String pr, char[][] map, int h, int w, int t) {
        for(int i=0; i<pr.length(); i++) {
            int nx = 0, ny = 0;
            if(pr.charAt(i) == 'U') {
                direction = 3;
                nx = startX + dir[direction][0];
                ny = startY + dir[direction][1];
            } else if(pr.charAt(i) == 'D') {
                direction = 2;
                nx = startX + dir[direction][0];
                ny = startY + dir[direction][1];
            } else if(pr.charAt(i) == 'L') {
                direction = 1;
                nx = startX + dir[direction][0];
                ny = startY + dir[direction][1];
            } else if(pr.charAt(i) == 'R') {
                direction = 0;
                nx = startX + dir[direction][0];
                ny = startY + dir[direction][1];
            } else {
//				System.out.println("i"+i);
                shooting(map, h, w);
//				print(map, h, w, t);
//				System.out.println("=============");
                continue;
            }

            map[startX][startY] = direc[direction];

            if(nx < 0 || ny < 0 || nx >= h || ny >= w) {
                continue;
            }

            if(map[nx][ny] == '-') {
                continue;
            }

            if(map[nx][ny] == '.') {
                map[startX][startY] = '.';
                startX = nx;
                startY = ny;
                map[startX][startY] = direc[direction];
            } else {
                map[startX][startY] = direc[direction];
            }
//			System.out.println("i"+i);
//			print(map, h, w, t);
        }
        print(map, h, w, t);
    }

    static void print(char[][] map, int h, int w, int t) {
        System.out.print("#"+t+" ");
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    static void shooting(char[][] map, int h, int w) {
        int x = startX;
        int y = startY;
        while(true) {
            int nx = x + dir[direction][0];
            int ny = y + dir[direction][1];

            if(nx < 0 || ny < 0 || nx >= h || ny >= w) {
                break;
            }

            if(map[nx][ny] == '#') {
                break;
            }

            if(map[nx][ny] == '-') {
                x = nx;
                y = ny;
                continue;
            }

            if(map[nx][ny] == '*') {
                map[nx][ny] = '.';
                x = nx;
                y = ny;
                break;
            }

            if(map[nx][ny] == '.') {
                x = nx;
                y = ny;
                continue;
            }
        }
    }

}

