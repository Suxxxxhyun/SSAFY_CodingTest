package saffy.Rugusee.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11 {
    public String solution(String str) {
        String answer = "";
        //마지막 문자까지 비교하기 위해서는 빈문자를 추가해야한다
        str = str + " ";
        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            //문자 두개가 같으면 cnt 누적, 다를때 cnt를 1로 초기화 후 통과
            if (str.charAt(i) == str.charAt(i + 1)) cnt++;
            else {
                //문자가 다를 때 i라는 문자를 누적하고 cnt가 1보다 클때만 누적
                //i와 i+1이 다를 때 answer에 i번째 문자를 누적
                answer += str.charAt(i);
                //숫자를 문자로 바꿔 answer에 누적
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
                continue;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main_11 main = new Main_11();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
