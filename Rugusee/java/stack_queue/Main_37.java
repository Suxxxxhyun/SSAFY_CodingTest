package saffy.Rugusee.java.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Main_37 {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        // 문자가 ')'를 찾으면 스택에서 '('를 찾아 pop시킴
        //')' 가 더 많은 경우
        // 문자를 ')'를 찾았을 때 스택이 비어있으면 잘못된 괄호임
        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                else stack.pop();
            }
        }

        //올바른 괄호 였으면 이전 반복문에서 스택이 모두 pop돼서 비어있어야됨
        //'(' 가 더 많은 경우
        if (!stack.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Main_37 main = new Main_37();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
