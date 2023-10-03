package saffy.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.sw
 * fileName       : Solution2005
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-03        qkrtn_ulqpbq2       최초 생성
 */
public class Solution2005 {

    static int t, n;
    static int[][] a;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            n = Integer.parseInt(br.readLine());
            a = new int[n][n];
            for(int j=0; j<n; j++){
                for(int k=0; k<=j; k++){
                    if(k == 0){
                        a[j][k] = 1;
                    } else if(j == k){
                        a[j][k] = 1;
                    } else {
                        a[j][k] = a[j-1][k-1] + a[j-1][k];
                    }
                }
            }

            sb.append("#" + (i+1)).append('\n');
            for(int j=0; j<n; j++){
                for(int k=0; k<=j; k++){
                    sb.append(a[j][k] + " ");
                }
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }
}
