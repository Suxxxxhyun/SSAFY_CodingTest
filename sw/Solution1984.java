package saffy.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.sw
 * fileName       : Solution1984
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-03        qkrtn_ulqpbq2       최초 생성
 */
public class Solution1984 {

    static int t;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int min = -1, max = 10000;
            double sum = 0;
            String ans = "";
            sb.append("#" + (i+1) + " ");
            for(int k=0; k<10; k++){
                int num = Integer.parseInt(st.nextToken());
                sum += num;
                min = Math.max(min, num);
                max = Math.min(max, num);
            }
            sum -= min;
            sum -= max;
            ans = (String.format("%.0f", sum / 8));
            sb.append(ans).append('\n');
        }
        System.out.println(sb);
    }
}
