package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.bj
 * fileName       : Main229203
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-04        qkrtn_ulqpbq2       최초 생성
 */
public class Main229203 {

    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;
        if(n == 1){
            System.out.println(count);
        } else {
            while(range <= n){
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
