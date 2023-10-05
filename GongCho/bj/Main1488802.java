package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.GongCho.bj
 * fileName       : Main1488802
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-05        qkrtn_ulqpbq2       최초 생성
 */
public class Main1488802 {

    static int n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    static int[] a, operator, selected;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        operator = new int[4];
        selected = new int[n-1];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<4; i++){
            operator[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0);
        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int idx){
        if(idx == n - 1){
            int x = calculator();
            min = Math.min(x, min);
            max = Math.max(x, max);
            return;
        }

        for(int i = 0; i<4; i++){
            if(operator[i] > 0){
                selected[idx] = i;
                operator[i]--;
                dfs(idx + 1);
                operator[i]++;
            }
        }
    }

    static int calculator(){
        int value = a[0], index = 1;
        for(int i=0; i<n-1; i++){
            if(selected[i] == 0){
                value += a[index++];
            } else if(selected[i] == 1){
                value -= a[index++];
            } else if(selected[i] == 2){
                value *= a[index++];
            } else {
                if(value < 0){
                    value = -value;
                    value /= a[index++];
                    value = -value;
                } else {
                    value /= a[index++];
                }
            }
        }
        return value;
    }
}
