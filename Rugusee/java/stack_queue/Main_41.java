package saffy.Rugusee.java.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Main_41 {
    public int solution (String str) {
        //answer = ( 3 + 3 + 1 + 3 ) + 1 + 2 + 1 + 1 + 1 + 1
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '(') stack.push(str.charAt(i));
            else {
                stack.pop();
                //바로 앞 지점이 여는 괄호이면 레이저 지점이라 스택의 모든 막대기 누적
                if(str.charAt(i - 1) == '(') answer += stack.size();
                else answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_41 main = new Main_41();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(main.solution(str));
    }
}
