package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.GongCho.bj
 * fileName       : Main283903
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-06        qkrtn_ulqpbq2       최초 생성
 */
//2:48 ~ 3:15
public class Main283903 {

    static int n, cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        while(n >= 0){
            if(n % 5 == 0){
                System.out.println(n/5 + cnt);
                break;
            } else {
                n -= 3;
                cnt += 1;
            }
        }
        if(n < 0){
            System.out.println(-1);
        }
    }
}
