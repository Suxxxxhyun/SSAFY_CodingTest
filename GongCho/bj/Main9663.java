package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * packageName    : saffy.GongCho.bj
 * fileName       : Main9663
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-05        qkrtn_ulqpbq2       최초 생성
 */
// 9:00 ~ 9:40, 왜 왼쪽끝을 (1,1)로 뒀을까?
public class Main9663 {

    static int n, cnt = 0;
    static int[] col;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        col = new int[n+1];
        dfs(1);
    }

    static void dfs(int row){
        if(row == n+1){
            cnt += 1;
        } else {
            for(int c=1; c<=n; c++){
                boolean possible = true;
                for(int i=1; i<=row-1; i++){
                    if(attackable(row, c, i, col[i])){
                        possible = false;
                        break;
                    }
                }
                if(possible){
                    col[row] = c;
                    dfs(row + 1);
                    col[row] = 0;
                }
            }
        }
    }

    static boolean attackable(int r1, int c1, int r2, int c2){
        if(c1 == c2){
            return true;
        }
        if(r1 - c1 == r2 - c2){
            return true;
        }
        if(r1 + c1 == r2 + c2){
            return true;
        }
        return false;
    }
}
