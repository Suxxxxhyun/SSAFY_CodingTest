package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.GongCho.sw
 * fileName       : Solution1945
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-05        qkrtn_ulqpbq2       최초 생성
 */
public class Solution1945 {

    static int t,n;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            n = Integer.parseInt(br.readLine());
            int a = 0, b = 0, c = 0, d = 0, e = 0;
            while(n % 2 == 0){
                n /= 2;
                a+=1;
            }
            while(n % 3 == 0){
                n /= 3;
                b += 1;
            }
            while(n % 5 == 0){
                n /= 5;
                c += 1;
            }
            while(n % 7 == 0){
                n /= 7;
                d += 1;
            }
            while(n % 11 == 0){
                n /= 11;
                e += 1;
            }
            //System.out.println(a + " " + b + " " + c + " " + d + " " + e);
            sb.append("#" + (i) + " " + a + " " + b + " " + c + " " + d + " " + e).append('\n');
        }
        System.out.println(sb);
    }
}
