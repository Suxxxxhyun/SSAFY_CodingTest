package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main2512
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-03        qkrtn_ulqpbq2       최초 생성
 */
// 11:00 ~ 11:40
public class Main2512 {

    static int n,m, max, s;
    static int[] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        a = new int[n];
        max = 0;
        s = 0;
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
            s += a[i];
            max = Math.max(a[i], max);
        }
        m = Integer.parseInt(br.readLine());
        pro();
    }

    static void pro(){
        if(m >= s){
            System.out.println(max);
        } else {
            int L = 0, R = 100000, ans = 0;
            while(L <= R){
                int mid = (L + R) / 2;
                if(determination(mid)){
                    ans = mid;
                    L = mid + 1;
                } else {
                    R = mid - 1;
                }
            }
            System.out.println(ans);
        }
    }

    static boolean determination(int x){
        int sum = 0, max = 0;
        if(m < x){
            return false;
        } else {
            for(int i=0; i<n; i++){
                if(a[i] > x){
                    sum += x;
                } else {
                    sum += a[i];
                }
            }
            return sum <= m;
        }
    }
}
