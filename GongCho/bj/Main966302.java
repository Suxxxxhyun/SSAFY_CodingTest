package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * packageName    : saffy.GongCho.bj
 * fileName       : Main966302
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-05        qkrtn_ulqpbq2       최초 생성
 */
public class Main966302 {

    static int n, cnt;
    static ArrayList<Integer> nq = new ArrayList<Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        pro(0);
        System.out.println(cnt);
    }

    static void pro(int row){
        if(row == n){
            cnt++;
            return;
        }

        for(int cand = 0; cand < n; cand ++){
            if(pruning(cand)){
                nq.add(cand);
                pro(row + 1);
                nq.remove(nq.size()-1);
            }
        }
    }

    static boolean pruning(int col){
        int nextRow = nq.size();
        for(int i=0; i<nextRow; i++){
            if(nq.get(i) == col || (Math.abs(nq.get(i) - col) == nextRow - i)){
                return false;
            }
        }
        return true;
    }
}
