package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main2343
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-03        qkrtn_ulqpbq2       최초 생성
 */
//11:40 ~ 12:10
//블루레이가 x일때,
public class Main2343 {

    static int n,m;
    static int[] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n + 1];
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for(int i=1; i<=n; i++){
            a[i] = Integer.parseInt(st1.nextToken());
        }
        pro();
    }

    static void pro(){
        int L = 1, R = 1000000000, ans = 0;
        for (int i = 1; i <= n; i++) L = Math.max(L, a[i]);
        while(L <= R){
            int mid = (L + R) / 2;
            if(determination(mid)){
                R = mid - 1;
                ans = mid;
            } else {
                L = mid + 1;
            }
        }
        System.out.println(ans);
    }

    static boolean determination(int x){
        int hap = 0, count = 1;
        for(int i=1; i<=n; i++){
            /*hap += a[i];
            if(hap > x){
                hap = 0;
                i -= 1;
                count += 1;
            }*/
            if(hap + a[i] > x){
                count++;
                hap = a[i];
            } else {
                hap += a[i];
            }
        }
        /*if(hap > 0){
            count += 1;
        }*/
        return count <= m;
    }
}
