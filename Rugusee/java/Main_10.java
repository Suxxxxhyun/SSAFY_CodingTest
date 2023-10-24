package saffy.Rugusee.java;

import java.util.Scanner;

public class Main_10 {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int p = 1000;
        //e가 아니면 거리를 증가시키는 개념
        //왼쪽 e를 기준으로 거리를 계산한 다음 거리를 대입
        //오른쪽 e을 기준으로 거리를 계산한 다음 거리가 짧은 것으로 교체
        //   0 1 2 3 4 5 6 7 8 9 10
        //S: t e a c h e r m o d e
        //           0 1 2 3 4 5 6 7 8 9 10
        //answer: 1001 0 1 2 3 0 1 2 3 4 0 (1회차 - 왼쪽만)
        //answer:    1 0 1 2 1 0 1 2 2 1 0 (2회차 - 왼쪽이랑 오른쪽 비교)

        //왼쪽e로 부터 떨어진 거리, 0~10
        //answer: 1001 0 1 2 3 0 1 2 3 4 0 (1회차 - 왼쪽만)
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }

        }

        //오른쪽e로 부터 떨어진 거리, 10~0 반복
        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == c) p=0;
            else {
                p++;
                //기본 값과 p중에서 작은 값을 선택
                answer[i] = Math.min(answer[i], p);
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        Main_10 main = new Main_10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x : main.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}
