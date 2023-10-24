package saffy.Rugusee.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_04 {

    public ArrayList<String> solution(int n, String[] arr){
        ArrayList<String> answer = new ArrayList<>();
        //1
//        for(String x : arr) {
//            //StringBuilder 저장 후 뒤집어서 스트링화로 바꿔 스트링 객체에 들어감
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }

        //2
        for (String x: arr) {
            //문자열을 문자배열로 반환
            char[] ch = x.toCharArray();
            int lt=0, rt=x.length()-1; //lt: 시작점, rt: 끝점
            //reverse
            while (lt<rt) {
                //swap
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;

                lt++;
                rt--;
            }
            //valueOf는 static으로 선언 된 클래스 메소드
            String tmp = String.valueOf(ch);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_04 main = new Main_04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        for(String x : main.solution(n, arr)) {
            System.out.println(x);
        }

    }
}
