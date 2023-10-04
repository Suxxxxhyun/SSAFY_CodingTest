package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main1566302
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-04        qkrtn_ulqpbq2       최초 생성
 */
// 1:43 ~ 2:00
public class Main1566302 {

    static int n,m;
    static StringTokenizer st;
    static boolean[] visited;
    static int[] a, selected;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n];
        selected = new int[m];
        visited = new boolean[n];
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
            return;
        }

        // 숫자 자체가 자연수로 한정되어있기때문에 0으로 초기화
        int before = 0;
        for(int i=0; i<n; i++){
            if(!visited[i] && before != a[i]){
                selected[idx] = a[i];
                before = a[i];
                visited[i] = true;
                dfs(idx + 1);
                visited[i] = false;
            }
        }
    }
}
