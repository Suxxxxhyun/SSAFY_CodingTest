package saffy.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.sw
 * fileName       : Solution1989
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-03        qkrtn_ulqpbq2       최초 생성
 */
public class Solution1989 {

    static int t;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            sb.append("#" + (i+1) + " ");
            String st = br.readLine();
            StringBuilder str = new StringBuilder();
            str.append(st);
            if(str.reverse().toString().equals(st)){
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
}
