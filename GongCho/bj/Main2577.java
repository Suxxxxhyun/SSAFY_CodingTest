package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.bj
 * fileName       : Main2577
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-25        qkrtn_ulqpbq2       최초 생성
 */
public class Main2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = 1;
        for(int i=0; i<3; i++){
            int n = Integer.parseInt(br.readLine());
            val *= n;
        }
        int[] n = new int[10];
        String st = String.valueOf(val);
        for(int i=0; i<st.length(); i++){
            n[st.charAt(i) - '0']++;
        }
        for(int i=0; i<n.length; i++){
            System.out.println(n[i]);
        }
    }
}
