package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main11650
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        qkrtn_ulqpbq2       최초 생성
 */
public class Main11650 {

    static class dot implements Comparable<dot>{

        int x,y;

        public dot(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int compareTo(dot other){
            if(this.x == other.x){
                return this.y - other.y;
            }
            return this.x - other.x;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dot[] d = new dot[n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            d[i] = new dot(x,y);
        }

        Arrays.sort(d);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(d[i].x + " " + d[i].y).append('\n');
        }
        System.out.println(sb);
    }
}
