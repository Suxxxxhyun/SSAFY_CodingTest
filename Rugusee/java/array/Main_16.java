package saffy.Rugusee.java.array;

import java.util.*;

public class Main_16 {
//    public int[] solution (int n) {
//        //1
//        int[] answer = new int[n];
//        answer[0] = 1;
//        answer[1] = 1;
//
//        //3번째 부터
//        for (int i=2; i<n; i++){
//            answer[i] = answer[i-2] + answer[i-1];
//        }
//
//        return answer;
//    }

    public void solution(int n) {
        int a=1, b=1, c;
        System.out.print(a + " " + b + " ");
        for (int i=2; i<n; i++){
            //원래 a=1 b=1 c=2 였지만 a=b b=c c=새로운 숫자로 값을 바꾼다
            c = a + b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {
        Main_16 main = new Main_16();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int x: main.solution(n)) {
//            System.out.print(x + " ");
//        }

        main.solution(n);
    }
}
