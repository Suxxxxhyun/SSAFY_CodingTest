package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/**
 * packageName    : saffy.bj
 * fileName       : Main11866
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-27        qkrtn_ulqpbq2       최초 생성
 */
public class Main11866 {

    static int n,k;
    static Deque<Integer> dq = new LinkedList<Integer>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        n = Integer.parseInt(st[0]);
        k = Integer.parseInt(st[1]);
        for(int i=1; i<=n; i++){
            dq.offer(i);
        }
        pro();
    }

    static void pro(){
        sb.append('<');
        while(dq.size() > 1){
            for(int i=0; i<k; i++){
                dq.offerLast(dq.pollFirst());
            }
            sb.append(dq.pollLast()).append(',').append(' ');
        }
        sb.append(dq.poll()).append('>');
        System.out.println(sb);
    }
}
