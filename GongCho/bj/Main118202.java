package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main118202
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-04        qkrtn_ulqpbq2       최초 생성
 */
public class Main118202 {

    static int n,s, cnt;
    static StringTokenizer st;
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
        System.out.println((s == 0) ? cnt - 1: cnt);
    }

    static void pro(int idx, int sum){
        if(idx == n){
            if(sum == s){
                cnt++;
            }
            return;
        }

        pro(idx + 1, sum);
        pro(idx + 1, sum + a[idx]);
    }
}
