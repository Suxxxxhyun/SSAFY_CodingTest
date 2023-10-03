package saffy.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.sw
 * fileName       : Solution1986
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-03        qkrtn_ulqpbq2       최초 생성
 */
public class Solution1986 {

    static int t, n;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            n = Integer.parseInt(br.readLine());
            int sum = 0;
            for(int j=1; j<=n; j++){
                if(j % 2 == 0){
                    sum -= j;
                } else {
                    sum += j;
                }
            }
            //System.out.println("sum = " + sum);
            sb.append("#" + (i+1) + " ").append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
