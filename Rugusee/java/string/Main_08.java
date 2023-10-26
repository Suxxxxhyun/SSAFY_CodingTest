package saffy.Rugusee.java.string;

import java.util.Scanner;

public class Main_08 {
    public String solution(String str) {
        String answer = "NO";
        //대문자 A-Z까지 아닌 것들을 모두 빈문자로 바꿈, replaceAll은 정규식 가능 replace는 정규식 안됨
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Main_08 main = new Main_08();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }
}
