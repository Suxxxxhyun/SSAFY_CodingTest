package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main2805
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-03        qkrtn_ulqpbq2       최초 생성
 */
//10:30 ~ 11:10
public class Main2805 {

    static int n,m;
    static int[] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n];
        StringTokenizer sta = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sta.nextToken());
        }
        pro();
    }

    static void pro(){
        long L = 0, R = Integer.MAX_VALUE, ans = 0;
        while(L <= R){
            long mid = (L + R) / 2;
            if(determination(mid)){
                L = mid + 1;
                ans = mid;
            } else {
                R = mid - 1;
            }
        }
        System.out.println(ans);
    }

    static boolean determination(long len){
        long sum = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] > (int)len){
                sum += (a[i] - len);
            }
        }
        return sum >= m;
    }
}
