package saffy.Rugusee.java;

import java.util.Scanner;

public class Main_07 {
    public String solution(String str) {
        String answer = "YES";
        //1
//        str = str.toUpperCase();
//        int len = str.length();
//        //len/2 -> 길이를 2로나눈 몫의 전까지만 반복하면됨
//        for (int i=0; i<len/2; i++){
//            if(str.charAt(i) != str.charAt(len-i-1)) {
//                //i와 len-i-1을 비교해야 시작과 끝을 비교할 수 있다(예: 0, 4-0-1)
//                return "NO";
//            }
//        }

        //2
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)) answer="NO";

        return answer;
    }

    public static void main(String[] args) {
        Main_07 main = new Main_07();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
