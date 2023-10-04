package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.bj
 * fileName       : Main2292
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        qkrtn_ulqpbq2       최초 생성
 */
//9:20 ~ 9:50
public class Main2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1, start_range = 2;

        if(n == 1){
            System.out.println(cnt);
        } else {
            while(start_range <= n){
                start_range = start_range + (6 * cnt);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
