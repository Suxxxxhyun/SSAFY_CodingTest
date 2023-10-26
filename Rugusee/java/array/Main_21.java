package saffy.Rugusee.java.array;

import java.util.Scanner;

public class Main_21 {
    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1; //행의 합
        int sum2; //열의 합

        //i가 n일때 j는 0-n 반복, 가로줄 세로줄
        for (int i = 0; i < n; i++) {
            //i가 0일 때 sum1: 0행의 합, sum2: 0열의 합
            //각각의 행과 열의 합을 구하기 위해 매번 초기화 해야한다.
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j]; //행의합, i가 고정되고 j가 움직이면서 합을 더함
                sum2 += arr[j][i];
            }
            //sum1과 sum2 중에 최댓값 찾기
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            //(왼쪽 위에서 오른쪽 아래의) 대각선의 합
            sum1 += arr[i][i];
            //arr[i][n-i-1] = arr[0][5-0-1] = arr[1][5-1-1]
            //(오른쪽 위에서 왼쪽 아래의) 대각선의 합
            sum2 += arr[i][n-i-1];
        }
        //sum1과 sum2 중에 최댓값 찾기
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Main_21 main = new Main_21();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        //격자판 입력 - 이차원 배열로
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(main.solution(n, arr));

    }
}
