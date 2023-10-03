package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이 길이였을때, 만들 수 있냐 없냐?

/**
 * packageName    : saffy.bj
 * fileName       : Main1654
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-03        qkrtn_ulqpbq2       최초 생성
 */
//10:00 ~ 10:40
public class Main1654 {

    static int k,n;
    static int[] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        a = new int[k + 1];
        for(int i=1; i<=k; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        pro();

    }

    static void pro(){
        long L = 1, R = Integer.MAX_VALUE, ans = 0;
        while(L <= R){
            long mid = (L + R) / 2;
            if(determination(mid)){
                ans = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        System.out.println(ans);
    }

    static boolean determination(long len){
        long sum = 0;
        for(int i=1; i<=k; i++){
            sum += a[i] / len;
        }
        return sum >= n;
    }
}
