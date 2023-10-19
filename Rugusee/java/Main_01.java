package saffy.Rugusee.java;

import java.util.Scanner;

public class Main_01 {
    public int solution(String str, char ch){
        int answer=0;
        str=str.toUpperCase();
        ch=Character.toUpperCase(ch);

        //1
//        for (int i=0; i<str.length(); i++) {
//            if(str.charAt(i) == ch) {
//                answer++;
//            }
//        }

        //2
        for (char x: str.toCharArray()) {
            if(x==ch) answer++;
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main_01 main = new Main_01();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char ch = sc.next().charAt(0);

        System.out.println(main.solution(str, ch));
    }
}
