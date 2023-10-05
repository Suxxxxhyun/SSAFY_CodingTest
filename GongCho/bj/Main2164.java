package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/**
 * packageName    : saffy.GongCho.bj
 * fileName       : Main2164
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-05        qkrtn_ulqpbq2       최초 생성
 */
public class Main2164 {

    static int n;
    static Deque<Integer> dq = new LinkedList<Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++){
            dq.offer(i);
        }
        while(dq.size() > 1){
            dq.pollFirst();
            dq.offer(dq.pollFirst());
        }
        System.out.println(dq.peek());
    }
}
