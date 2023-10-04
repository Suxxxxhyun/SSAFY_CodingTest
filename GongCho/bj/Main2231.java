package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.bj
 * fileName       : Main2231
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        qkrtn_ulqpbq2       최초 생성
 */
//8:36 ~ 9:00
public class Main2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cns = 0;
        for(int i=1; i<=n; i++){
            int num = i;
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            if(sum + i == n){
                cns = i;
                break;
            }
        }
        System.out.println(cns);
    }
}
