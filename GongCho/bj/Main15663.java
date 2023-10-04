package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main15663
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-04        qkrtn_ulqpbq2       최초 생성
 */
// 중복되는 수열은 한번만 출력한다.
public class Main15663 {

    static int n,m;
    static StringTokenizer st;
    static int[] a, selected;
    static boolean[] isUsed;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n];
        selected = new int[m];
        isUsed = new boolean[n];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        dfs(0);
        System.out.println(sb);
    }

    static void dfs(int idx){
        if(idx == m){
            for(int i=0; i<m; i++){
                sb.append(selected[i] + " ");
            }
            sb.append('\n');
        } else {
            int before = 0;
            for(int i=0; i<n; i++){
//                if(isUsed[i]){
//                    continue;
//                }
                if(!isUsed[i] && before != a[i]){
                    isUsed[i] = true;
                    selected[idx] = a[i];
                    before = a[i];
                    dfs(idx + 1);
                    isUsed[i] = false;
                }
            }
        }
    }
}
