package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main10816
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-27        qkrtn_ulqpbq2       최초 생성
 */
public class Main10816 {

    static int n, m;
    static Map<Integer, Integer> a = new HashMap<Integer, Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            int x = Integer.parseInt(st.nextToken());
            if(a.containsKey(x)){
                a.put(x, a.get(x)+1);
            } else {
                a.put(x, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<m; i++){
            int x = Integer.parseInt(st2.nextToken());
            if(a.containsKey(x)){
                sb.append(a.get(x) + " ");
            } else {
                sb.append(0 + " ");
            }
        }
        System.out.println(sb);
    }
}
