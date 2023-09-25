package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : saffy.bj
 * fileName       : Main3052
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-25        qkrtn_ulqpbq2       최초 생성
 */
public class Main3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> s = new HashSet<Integer>();
        for(int i=0; i<10; i++){
            int a = Integer.parseInt(br.readLine());
            s.add(a % 42);
        }
        System.out.println(s.size());
    }
}
