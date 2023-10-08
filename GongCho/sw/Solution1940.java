package saffy.GongCho.sw;

/**
 * packageName    : saffy.GongCho.sw
 * fileName       : Solution1940
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-08        qkrtn_ulqpbq2       최초 생성
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//~9:20
//입력으로 주어진 N 개의 command 를 모두 수행했을 때,
//N 초 동안 이동한 거리를 계산하는 프로그램을 작성하라.
//2
//1 2 (가속, 가속도:2m/s^2)
//2 1 (감속, 가속도:1m/s^2)
//2
public class Solution1940 {

    static int t, n;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            n = Integer.parseInt(br.readLine());
            int speed = 0, dis = 0;
            for(int j=0; j<n; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                if(x == 1) {
                    speed += Integer.parseInt(st.nextToken());
                } else if(x == 2) {
                    speed -= Integer.parseInt(st.nextToken());
                }
                if(speed < 0) {
                    speed = 0;
                }
                dis += speed;
            }
            sb.append("#" + i + " ").append(dis).append('\n');
        }
        System.out.println(sb);
    }

}

