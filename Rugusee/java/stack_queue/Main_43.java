package saffy.Rugusee.java.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_43 {
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for(char x : need.toCharArray()) Q.offer(x);
        for(char x : plan.toCharArray()) {
            //필수과목이 맞을 때
            if(Q.contains(x)) {
                //큐의 최상단과 x가 일치하지 않을 때 -> need의 수강 순서를 지켜야함
                if(x != Q.poll()) return "NO";

            }
        }

        //필수과목을 수강하지 않았을 때
        if(!Q.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Main_43 main = new Main_43();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = sc.next();

        System.out.println(main.solution(s, str));
    }
}
