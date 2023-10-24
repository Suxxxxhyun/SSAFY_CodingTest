package saffy.Rugusee.java;

import java.util.Scanner;

public class Main_09 {
    public int solution(String str) {
        //int answer = 0;

        //asci code(num): '0'(48) ~ '9'(57) <-> (word) 'a'(97)~'z'(122), 'A'(65)~'Z'(90)
        //answer = answer * 10 + (x-48)
        // 0 = 0 * 10 + 0
        // 1 = 0 * 10 + 1
        // 12 = 1 * 10 + 2
        // 120 = 12 * 10 + 0
        // 1205 = 120 * 10 + 5
        //1)
//        for (char x: str.toCharArray()) {
//            //문자로된 숫자 x를 48로 치환, 괄호를 안쓰면 x가 아스키 숫자로 들어가니 괄호 꼭 써야됨
//            if(x>=48 && x<=57) answer = answer*10 + (x-48);
//        }

        //2)
        String answer = "";
        for (char x: str.toCharArray()) {
            //x가 숫자가 맞다면(true) answer에 x를 누적시킨다
            if(Character.isDigit(x)) answer += x;
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main_09 main = new Main_09();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }
}
