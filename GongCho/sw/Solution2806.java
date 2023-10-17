package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution2806 {

    static int t, n, ans = 0;
    //인덱스는 행, 값은 열을 의미하도록 설계
    static List<Integer> list;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            n = Integer.parseInt(br.readLine());
            list = new ArrayList<Integer>();
            pro(0);
            System.out.println("#"+i+" "+ans);
            ans = 0;
        }

    }

    static void pro(int row) {
        if(row == n) {
            ans += 1;
            return;
        }

        for(int col=0; col<n; col++) {
            if(pruning(col)) {
                list.add(col);
                pro(row + 1);
                list.remove(row);
            }
        }
    }

    static boolean pruning(int current_col) {
        int current_row = list.size(); //현재의 행

        for(int k=0; k<current_row; k++) {
            //수평,수직조건 판단
            if((list.get(k) - current_col == 0) || (Math.abs(list.get(k) - current_col) == Math.abs(k - current_row))) {
                return false;
            }
        }
        return true;
    }

}

