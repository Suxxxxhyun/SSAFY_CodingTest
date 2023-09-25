package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main10250
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-25        qkrtn_ulqpbq2       최초 생성
 */
public class Main10250 {
    // h w n => h가 층, w가 가로로 몇개 있는지, n이 몇 번째

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            if(n % h == 0) {
                sb.append(h * 100 + (n / h)).append('\n');
            } else {
                sb.append(((n % h) * 100) + ((n / h) + 1)).append('\n');
            }
        }
        System.out.println(sb);
    }
}
