package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main15651
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-04        qkrtn_ulqpbq2       최초 생성
 */
public class Main15651 {

    static int n,m;
    static int[] selected;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        selected = new int[m];
        pro(0);
    }

    static void pro(int idx){
        if(idx == m){
            for(int i=0; i<m; i++){
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=1; i<=n; i++){
            selected[idx] = i;
            pro(idx + 1);
        }
    }
}
