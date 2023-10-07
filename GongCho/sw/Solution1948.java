package saffy.GongCho.sw;

/**
 * packageName    : saffy.GongCho.sw
 * fileName       : Solution1948
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-07        qkrtn_ulqpbq2       최초 생성
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1948 {

    static int t;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int m1 = Integer.parseInt(st.nextToken());
            int d1 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());

            int ans = 0;
            if(m1 == m2) {
                ans = d2 - d1 + 1;
            } else {
                if(m1 == 1 || m1 == 3 || m1 == 5 || m1 == 7 || m1 == 8 || m1 == 10 || m1 == 12) {
                    ans += 31 - d1 + 1;
                } else if(m1 == 2) {
                    ans += 28 - d1 + 1;
                } else {
                    ans += 30 - d1 + 1;
                }
                for(int j=m1+1; j<m2; j++) {
                    if(j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12) {
                        ans += 31;
                    } else if(j == 2) {
                        ans += 28;
                    } else {
                        ans += 30;
                    }
                }
                ans += d2;
            }
            sb.append("#" + i + " " + ans).append('\n');
        }
        System.out.println(sb);

    }

}

