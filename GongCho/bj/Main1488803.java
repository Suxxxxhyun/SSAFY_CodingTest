package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.GongCho.bj
 * fileName       : Main1488803
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-05        qkrtn_ulqpbq2       최초 생성
 */
public class Main1488803 {

    static int n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    static int[] a, operator;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        a = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        operator = new int[4];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<4; i++){
            operator[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0,a[0]);
        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int idx, int val){
        if(idx == n-1){
            min = Math.min(min, val);
            max = Math.max(max, val);
            return;
        }
        for(int i=0; i<4; i++){
            if(operator[i] > 0){
                operator[i]--;
                dfs(idx + 1, calculator(val, i,a[idx + 1]));
                operator[i]++;
            }
        }
    }

    static int calculator(int operand1, int operator, int operand2){
        if(operator == 0){
            return operand1 + operand2;
        } else if(operator == 1){
            return operand1 - operand2;
        } else if(operator == 2){
            return operand1 * operand2;
        } else {
            return operand1 / operand2;
        }
    }
}
