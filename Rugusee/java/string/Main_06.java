package saffy.Rugusee.java.string;

import java.util.Scanner;

public class Main_06 {

    public String solution(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++) {
              //str.charAt(i): i번째 문자가 발견되는 위치(중복제외),i: 현재문자의위치, 자기위치, str.indexOf(str.charAt(i)): i번째 문자가 처음 발견되는 위치(중복포함)
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);

        }


        return answer;
    }


    public static void main(String[] args) {
        Main_06 main = new Main_06();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
