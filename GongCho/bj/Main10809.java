package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.bj
 * fileName       : Main10809
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-25        qkrtn_ulqpbq2       최초 생성
 */
public class Main10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int[] alpha = new int[26];
        for(int i=0; i<26; i++){
            alpha[i] = -1;
        }
        for(int i=0; i<st.length(); i++){
            if(alpha[st.charAt(i) - 'a'] == -1){
                //System.out.println(st.charAt(i) - 'a');
                alpha[st.charAt(i) - 'a'] = i;
            }
        }
        for(int i=0; i<26; i++){
            System.out.print(alpha[i] + " ");
        }
    }
}
