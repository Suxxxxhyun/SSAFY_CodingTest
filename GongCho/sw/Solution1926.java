package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.sw
 * fileName       : Solution1926
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-27        qkrtn_ulqpbq2       최초 생성
 */
public class Solution1926 {

    static int n;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++){
            String st = String.valueOf(i);
            int cnt = 0;
            for(int j=0; j<st.length(); j++){
                char c = st.charAt(j);
                if(c == '3' || c == '6' || c == '9'){
                    cnt += 1;
                }
            }
            if(cnt == 1){
                sb.append("-").append(' ');
            } else if(cnt == 2){
                sb.append("--").append(' ');
            } else if(cnt == 3){
                sb.append("---").append(' ');
            } else {
                sb.append(i).append(' ');
            }
        }
        System.out.println(sb);
    }
}
