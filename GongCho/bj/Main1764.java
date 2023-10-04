package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * packageName    : saffy.bj
 * fileName       : Main1764
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-27        qkrtn_ulqpbq2       최초 생성
 */
public class Main1764 {

    static int n,m, cnt;
    static List<String> list = new ArrayList<String>();
    static Set<String> a = new HashSet<String>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++){
            a.add(br.readLine());
        }

        cnt = 0;

        for(int i=0; i<m; i++){
            String x = br.readLine();
            if(a.contains(x)){
                list.add(x);
                cnt++;
            }
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(cnt).append('\n');
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i)).append('\n');
        }
        System.out.println(sb);
    }
}
