package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.bj
 * fileName       : Main1157
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-25        qkrtn_ulqpbq2       최초 생성
 */
public class Main1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[26];
        String st = br.readLine().toUpperCase();
        for(int i=0; i<st.length(); i++){
            a[st.charAt(i) - 'A']++;
        }

        int n = 0;
        char ans = ' ';
        for(int i=0; i<a.length; i++){
            if(n < a[i]){
                ans = (char)(i + 'A');
                n = a[i];
            } else if(n == a[i]){
                ans = '?';
            }
        }
        System.out.println(ans);


    }
}
