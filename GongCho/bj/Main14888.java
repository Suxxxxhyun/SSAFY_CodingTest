package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.GongCho.bj
 * fileName       : Main14888
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-05        qkrtn_ulqpbq2       최초 생성
 */
// ~ 8:00까지 고민해보기
// + - * /
// 1 2 3 4 5 6
// 2 1 1 1
public class Main14888 {

    static int n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    static int[] nums, operator;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        operator = new int[4];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<4; i++){
            operator[i] =  Integer.parseInt(st.nextToken());
        }
        dfs(0, nums[0]);
        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int idx, int num){
        if(idx == n - 1){
            min = Math.min(num, min);
            max = Math.max(num, max);
            return;
        }

        for(int cand = 0; cand < 4; cand++){
            if(operator[cand] != 0){
                operator[cand]--;
                dfs(idx + 1, calculator(num, cand, nums[idx + 1]));
                operator[cand]++;
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
            return operand2 / operand2;
        }
    }
}
