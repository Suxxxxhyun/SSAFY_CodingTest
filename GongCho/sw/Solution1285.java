package saffy.GongCho.sw;

/**
 * packageName    : saffy.GongCho.sw
 * fileName       : Solution1285
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-08        qkrtn_ulqpbq2       최초 생성
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
//9:53 ~ 10:20
public class Solution1285 {

    static int t, n;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            n = Integer.parseInt(br.readLine());
            Map<Integer, Integer> info = new HashMap<Integer, Integer>();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++) {
                int location = Integer.parseInt(st.nextToken());
                info.put(location, Math.abs(0 - location));
            }
            List<Integer> dis = new ArrayList(info.values());
            Collections.sort(dis);
            int before = dis.get(0);
            int people = 1;
            for(int j=1; j<dis.size(); j++) {
                int after = dis.get(j);
                if(before == after) {
                    people += 1;
                } else {
                    break;
                }
            }
            sb.append("#" + i + " ").append(before + " " + people).append('\n');
            people = 0;
        }
        System.out.println(sb);

    }

}

