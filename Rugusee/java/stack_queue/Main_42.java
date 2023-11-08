package saffy.Rugusee.java.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main_42 {
    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) Q.offer(i);

        //큐에 남은 갯수가 1이 될 때까지 반복
        //k번째 숫자는 poll
        while (!Q.isEmpty()) {
            //poll은 값을 꺼내고 값을 리턴 받고, offer로 값을 뒤에 저장한다.
            for (int i = 1; i < k; i++) Q.offer(Q.poll());
            Q.poll();
            //마지막 하나 남은 것이 답
            if(Q.size() == 1) answer = Q.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_42 main = new Main_42();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(main.solution(n, k));
    }
}
