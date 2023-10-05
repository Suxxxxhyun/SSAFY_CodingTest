package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * packageName    : saffy.GongCho.bj
 * fileName       : Main966303
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-05        qkrtn_ulqpbq2       최초 생성
 */
//10:23 ~ 11:00
public class Main966303 {

    static int n, cnt = 0;
    static ArrayList<Integer> nq = new ArrayList<Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dfs(0);
        System.out.println(cnt);
    }

    static void dfs(int row){
        if(row == n){
            cnt += 1;
            return;
        }

        for(int col=0; col<n; col++){
            if(pruning(col)){
                nq.add(col);
                dfs(row + 1);
                nq.remove(nq.size()-1);
            }
        }
    }

    static boolean pruning(int col){
        int nextRow = nq.size();
        for(int i=0; i<nextRow; i++){
            if((nq.get(i) == col) || (Math.abs(nq.get(i) - col) == nextRow - i)){
                return false;
            }
        }
        return true;
    }
}
