package saffy.GongCho.sw;

/**
 * packageName    : saffy.GongCho.sw
 * fileName       : Solution17319
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

public class Solution17319 {

    static int t;
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            int n = Integer.parseInt(br.readLine());
            String st = br.readLine();
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(int j=0; j<n / 2; j++) {
                sb1.append(st.charAt(j));
            }
            for(int j=n/2; j<st.length(); j++) {
                sb2.append(st.charAt(j));
            }
            answer.append("#" + i + " ");
            if(sb1.toString().equals(sb2.toString())) {
                answer.append("Yes").append('\n');
            } else {
                answer.append("No").append('\n');
            }
        }
        System.out.println(answer);

    }

}

