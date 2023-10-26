package saffy.Rugusee.java.array;

import java.util.Scanner;

public class Main_15 {
    public String solution(int n, int[] a, int[] b) {
        String answer = "";

        for (int i = 0; i < n; i++) {
                //1:가위, 2:바위, 3:보
                //비기는 경우
                if(a[i] == b[i]) answer += "D";
                //A가 이기는 3가지만 고려
                //B가 이기는 경우는 else
                else if (a[i] == 1 &&  b[i] == 3) answer += "A"; //가위 - 보
                else if (a[i] == 2 &&  b[i] == 1) answer += "A"; //바위 - 가위
                else if (a[i] == 3 &&  b[i] == 2) answer += "A"; //보 - 바위
                else answer += "B"; //B이기는 3가지 경우

        }

        return answer;
    }

    public static void main(String[] args) {
        Main_15 main = new Main_15();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        //문자 열을 문자 배열을 만들어 차례로 출력
        for (char x : main.solution(n, a, b).toCharArray()) System.out.println(x);
    }
}
