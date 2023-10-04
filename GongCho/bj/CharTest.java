package saffy.GongCho.bj;

import java.util.Arrays;

/**
 * packageName    : saffy.bj
 * fileName       : CharTest
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-27        qkrtn_ulqpbq2       최초 생성
 */
public class CharTest {
    public static void main(String[] args){
        char a = '1';
        char b = '2';
        char[] n = new char[2];
        n[0] = b;
        n[1] = a;
        Arrays.sort(n);
        System.out.println(n[0]);
    }
}
