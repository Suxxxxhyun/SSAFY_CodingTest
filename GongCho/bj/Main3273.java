package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main3273
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-27        qkrtn_ulqpbq2       최초 생성
 */
public class Main3273 {

    static int n, x, ans;
    static int[] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        x = Integer.parseInt(br.readLine());
        Arrays.sort(a);
        ans = 0;

        for(int i=0; i<n; i++){
            int y = x - a[i];
            pro(a,0,n-1,y);
        }
        System.out.println(ans / 2);
    }

    static void pro(int[] a, int L, int R, int x){

        while(L <= R){
            int mid = (L + R) / 2;
            if(a[mid] == x){
                ans++;
                //System.out.println("x = " + x);
                return;
            }

            if(a[mid] > x){
                R = mid - 1;
            } else if(a[mid] < x){
                L = mid + 1;
            }
        }
    }
}
