package saffy.Rugusee.java.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Main_40 {
    public int solution (String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        //연산자를 만나면 제일 상단의 숫자를 꺼낸 다음
        //rt에 넣고 그 아래 숫자를 꺼내 lt에 넣은 다음 연산을 한 후
        //스택에 다시 추가한다
        //연산이 끝나면 스택에서 값을 꺼내온다

        //숫자를 만나면 스택에 추가

        for(char x : str.toCharArray()) {
            //숫자인지 연산자인지 확인
            if(Character.isDigit(x)) stack.push(x-48);
            else {
                //연산자를 만났을 때
                int rt = stack.pop(); //첫 번째로 꺼내 온 숫자
                int lt = stack.pop();
                if(x == '+') stack.push(lt+rt);
                else if (x == '-') stack.push(lt-rt);
                else if(x == '*') stack.push(lt*rt);
                else if (x == '/') stack.push(lt/rt);
            }
        }

        answer = stack.get(0);

        return answer;
    }

    public static void main(String[] args) {
        Main_40 main = new Main_40();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(main.solution(str));
    }
}
