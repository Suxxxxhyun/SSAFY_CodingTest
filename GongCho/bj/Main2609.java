package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main2609
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        qkrtn_ulqpbq2       최초 생성
 */
public class Main2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int max = Math.max(a,b);
        int min = Math.min(a,b);

        int m = gcd(max, min);
        int n = m * (a / m) * (b / m);
        System.out.println(m);
        System.out.println(n);
    }

    //a와 b의 최대공약수는 b와 r의 최대공약수와 같다. 6 18
    public static int gcd(int x, int y){
        if(y == 0){
            return x;
        }

        return gcd(y, x % y);
    }
}
