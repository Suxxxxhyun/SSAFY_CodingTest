package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.bj
 * fileName       : Main1259
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        qkrtn_ulqpbq2       최초 생성
 */
public class Main1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sp = new StringBuilder();
        while(true){
            String st = br.readLine();
            StringBuilder sb = new StringBuilder();

            if(st.equals("0")){
                break;
            }

            sb.append(st);
            String st2 = sb.reverse().toString();
            if(st.equals(st2)){
                sp.append("yes").append('\n');
            } else {
                sp.append("no").append('\n');
            }
        }
        System.out.println(sp);
    }
}
