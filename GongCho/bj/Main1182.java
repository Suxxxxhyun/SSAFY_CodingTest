package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main1182
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-04        qkrtn_ulqpbq2       최초 생성
 */
//10:20 ~ 11:00
public class Main1182 {

    static StringTokenizer st;
    static int n,s, cnt;
    static int[] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        a = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        pro(0,0);
        if(s == 0){
            System.out.println(cnt - 1);
        } else {
            System.out.println(cnt);
        }
    }

    static void pro(int idx, int sum){
        if(idx == n){
            if(sum == s){
                cnt++;
            }
            return;
        }

        pro(idx + 1, sum);
        // 고르는 경우
        pro(idx + 1, a[idx] + sum);
    }
}
