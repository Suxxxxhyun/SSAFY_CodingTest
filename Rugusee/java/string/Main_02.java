package saffy.Rugusee.java.string;

import java.util.Scanner;

public class Main_02 {

    public String solution(String str) {
        String answer = "";

        for (char ch : str.toCharArray()) {
            //1
//            if (Character.isLowerCase(ch)) answer += Character.toUpperCase(ch);
//            else if (Character.isUpperCase(ch)) answer += Character.toLowerCase(ch);

            //2
            if (ch >= 97 && ch <= 122) answer += (char)(ch-32); //95-35=65 -> 소문자에서 대문자됨
            else if (ch >= 65 && ch <= 90) answer += (char)(ch+32);

            //3
//            if (ch >= 'a' && ch <= 'z') answer += Character.toUpperCase(ch);
//            else if (ch >= 'A' && ch <= 'Z') answer += Character.toLowerCase(ch);

        }

        //알파벳 대문자 아스키 번호: 65~90, 소문자: 97~122

        return answer;
    }

    public static void main(String[] args) {
        Main_02 main = new Main_02();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));

    }


}
