package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.bj
 * fileName       : Main2775
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        qkrtn_ulqpbq2       최초 생성
 */
public class Main2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] a = new int[15][15];

        for(int i=0; i<15; i++){
            a[0][i] = i;
        }

        for(int i=1; i<15; i++){
            for(int j=1; j<15; j++){
                int sum = 0;
                for(int k=1; k<=j; k++){
                    sum += a[i-1][k];
                }
                a[i][j] = sum;
                //System.out.print(i + "와" + j + " > " + a[i][j] + " ");
            }
            //System.out.println();
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(a[k][n]).append('\n');
        }
        System.out.println(sb);
    }
}
