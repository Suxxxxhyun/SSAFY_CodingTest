package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main1978
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        qkrtn_ulqpbq2       최초 생성
 */
public class Main1978 {

    static boolean[] prime = new boolean[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] num = new int[n];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for(int i=0; i<n; i++){
            int a = Integer.parseInt(st.nextToken());
            num[i] = a;
        }

        Arrays.sort(num);

        solve(num[num.length-1]);
        int cnt = 0;

        for(int i=0; i<num.length; i++){
            if(prime[num[i]]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void solve(int x){

        if(x == 0 || x == 1){
            return;
        }

        for(int i=2; i<=Math.sqrt(x); i++){

            if(!prime[i]){
                continue;
            }

            for(int j=i*i; j<prime.length; j=j+i){
                prime[j] = false;
            }
        }
    }
}
