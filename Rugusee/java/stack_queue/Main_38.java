package saffy.Rugusee.java.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Main_38 {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        //첫번째 문자부터 스택에 문자를 추가하다가 ')'를 찾으면
        //'(' 부터 ')' 까지 누적된 문자를 모두 스택에서 모두 제거한다
        for (char x : str.toCharArray()) {
            if (x == ')') {
                //stack.pop()한 것을 return - ')'이 아니고 ')'이전의 문자
                //'('이 아닐 때까지 계속 while문 반복 - '(' 만나기 전까지 계속 pop
                while (stack.pop() != '(');
            } else stack.push(x);
        }

        for(int i=0; i<stack.size(); i++) answer += stack.get(i);

        return answer;
    }

    public static void main(String[] args) {
        Main_38 main = new Main_38();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(main.solution(str));
    }
}
