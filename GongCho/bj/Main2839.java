package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.GongCho.bj
 * fileName       : Main2839
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-05        qkrtn_ulqpbq2       최초 생성
 */
public class Main2839 {

    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(true){
            if(n % 5 == 0){
                System.out.println(n / 5 + cnt);
                break;
            } else {
                if(n < 0){
                    System.out.println(-1);
                    break;
                }
                n -= 3;
                cnt++;
            }
        }
    }
}
