package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * packageName    : saffy.bj
 * fileName       : Main1427
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-27        qkrtn_ulqpbq2       최초 생성
 */
public class Main1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] n = br.readLine().toCharArray();

        Arrays.sort(n);

        for(int i=n.length-1; i>=0; i--){
            System.out.print(n[i]);
        }
    }
}
