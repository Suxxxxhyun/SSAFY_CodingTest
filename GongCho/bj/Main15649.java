package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main15649
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-04        qkrtn_ulqpbq2       최초 생성
 */
//4P2
public class Main15649 {

    static int n,m;
    static int[] selected, isUsed;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        selected = new int[m];
        isUsed = new int[n+1];
        pro(0);
        System.out.println(sb);
    }

    static void pro(int idx){
        if(idx == m){
            for(int i=0; i<m; i++){
                sb.append(selected[i] + " ");
            }
            sb.append('\n');
            return;
        }

        for(int i=1; i<=n; i++){
            if(isUsed[i] == 0){
                selected[idx] = i;
                isUsed[i] = 1;
                pro(idx + 1);
                isUsed[i] = 0;
            }
        }
    }
}
