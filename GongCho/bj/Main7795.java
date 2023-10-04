package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main7795
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-27        qkrtn_ulqpbq2       최초 생성
 */
//9:00 ~ 9:30
public class Main7795 {

    static int t;
    static int ans = 0;
    static int[] a, b;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            a = new int[Integer.parseInt(st.nextToken())];
            b = new int[Integer.parseInt(st.nextToken()) + 1];
            StringTokenizer stA = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<a.length; j++){
                a[j] = Integer.parseInt(stA.nextToken());
            }
            StringTokenizer stB = new StringTokenizer(br.readLine(), " ");
            for(int j=1; j<b.length; j++){
                b[j] = Integer.parseInt(stB.nextToken());
            }
            Arrays.sort(b, 1, b.length);
            for(int k=0; k<a.length; k++){
                ans += binary_search(b, 1, b.length - 1, a[k]);
            }
            sb.append(ans).append('\n');
            ans = 0;
        }
        System.out.println(sb);
    }

    static int binary_search(int[] b, int L, int R, int x){
        int count = L - 1;
        while(L <= R){
            int mid = (L + R) / 2;

            if(b[mid] < x){
                count = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return count;
    }
}
