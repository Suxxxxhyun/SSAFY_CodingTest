package saffy.Rugusee.java.array;

import java.util.Scanner;

public class Main_23 {

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        //i(1-5)번째 학생이 j(1-5)번째 학생과 비교하면서 같은 반이었던 학생을 찾는다(사람)
        //k(1-5)는 학년이 같은지 비교(학년)
        //a[i][k]번째 사람과 a[j][k]번째 사람이 같으면 cnt 증가
        //가장 같은 반을 많이 했던 사람을 찾는 것
        //i번째 학생의 cnt를 구함
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    //a[i][k]번째 사람과 a[j][k]번째 사람이 같으면 cnt 증가
                    //i번째 학생과 같은 반을 한 j번째 학생이 몇명인지 확인
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main_23 main = new Main_23();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6]; //n을 1번부터 사용하고 1-5 배열 할당

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println(main.solution(n, arr));
    }

}
