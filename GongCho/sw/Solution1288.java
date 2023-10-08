package saffy.GongCho.sw;

/**
 * packageName    : saffy.GongCho.sw
 * fileName       : Solution1288
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
import java.util.HashSet;
import java.util.Set;

public class Solution1288 {

    static int t, cnt;
    static String n;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            n = br.readLine();
            int val = Integer.parseInt(n);
            Set<Integer> s = new HashSet<Integer>();
            for(int k=0; k<10; k++) {
                s.add(k);
            }
            for(int j=0; j<n.length(); j++) {
                int x = n.charAt(j) - '0';
                s.remove(x);
            }
            cnt += 1;
            int start = 1;
            int value = val;
            while(s.size() > 0) {
                value *= ++start;
                String str = String.valueOf(value);
                for(int j=0; j<str.length(); j++) {
                    int x = str.charAt(j) - '0';
                    if(s.contains(x)) {
                        s.remove(x);
                    }
                }
                cnt += 1;
                value = val;
            }
            sb.append("#" + i + " ").append(cnt * val).append('\n');
            cnt = 0;
        }
        System.out.println(sb);
    }

}

