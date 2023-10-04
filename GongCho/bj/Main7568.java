package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.bj
 * fileName       : Main7568
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-27        qkrtn_ulqpbq2       최초 생성
 */
public class Main7568 {

    static int n;
    static int[][] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        a = new int[n][2];

        for(int i=0; i<n; i++){
            String[] st = br.readLine().split(" ");
            //System.out.println(st[0] + " " + st[1]);
            a[i][0] = Integer.parseInt(st[0]);
            a[i][1] = Integer.parseInt(st[1]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            int rank = 1;
            for(int j=0; j<n; j++){
                if(i == j){
                    continue;
                }
                if(a[i][0] < a[j][0] && a[i][1] < a[j][1]){
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }
        System.out.println(sb);
    }
}
