package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.sw
 * fileName       : Solution200102
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-03        qkrtn_ulqpbq2       최초 생성
 */
public class Solution200102 {

    static int t, n, m;
    static int[][] a;
    static StringBuilder sb =  new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            a = new int[n][n];
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine(), " ");
                for(int k=0; k<n; k++){
                    a[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            sb.append("#" + (i+1) + " ");
            pro();
        }
        System.out.println(sb);
    }

    static void pro(){
        int max = 0;
        for(int k=0; k<=n-m; k++){
            for(int l=0; l<=n-m; l++){
                int sum = 0;
                for(int i=0; i<m; i++){
                    for(int j=0; j<m; j++){
                        sum += a[i+k][j+l];
                    }
                }
                max = Math.max(sum, max);
            }
        }
        sb.append(max).append('\n');
    }
}
