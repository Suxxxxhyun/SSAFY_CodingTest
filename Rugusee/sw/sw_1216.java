package saffy.Rugusee.sw;

import java.util.Scanner;

public class sw_1216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer;
        char[][] grid = new char[100][100];
        boolean check;

        for (int test_case = 0; test_case < 10; test_case++) {
            int tc = sc.nextInt();
            answer = 0;

            //100x100 평면 글자판 입력
            for (int i = 0; i < grid.length; i++) {
                String str = sc.next();
                for (int j = 0; j < grid.length; j++) {
                    grid[i][j] = str.charAt(j);
                }
            }


            //첫째줄부터 행과 열에 따라 검사를 실시한다.
            //길이에 따라 첫번째 칸부터 길이만큼의 칸을 비교한다.
            //check 플래그를 이용해 회문인 경우와 회문이 아닌 경우를 나누고, count를 증가시킨다
            //for문을 하나 더 추가

            //len: 회문의 길이
            //회문 문제 공통 꼭 외우자 배열 탐색은 행 or 열 기준 -> 배열 길이 - 회문 길이 + 1 까지만 보면 됨 회문 문자열인지 아닌지
            for (int len = 0; len < grid.length + 1; len++) {
                //가로
                for (int i = 0; i < grid.length; i++) {
                    for (int j = 0; j < grid.length - len +1 ; j++) {
                        check = true;
                        for (int k = 0; k < len / 2; k++) {
                            //문자열을 반 접어서 비교한다고 생각 회문길이/2 횟수만큼 비교
                            //배열 중간(len/2)까지 순차적으로 i는 0부터 증가, j는 -1부터 감소
                            //i는 앞부터 중간, j는 끝부터 중간까지 검사
                            if (grid[i][j + k] != grid[i][j + len - k - 1]) {
                                check = false;
                                break;
                            }
                        }
                        //문자가 같고 길이가 0보다 크면 회문의 칸수를 저장
                        //저장된 회문의 칸수보다 더 큰 회문의 길이가 나타나면 저장
                        if (check && answer < len) answer = len;
                    }
                }

                //세로
                for (int j = 0; j < grid.length; j++) {
                    for (int i = 0; i <= grid.length - len; i++) {
                        check = true;
                        for (int k = 0; k < len / 2; k++) {
                            if (grid[i + k][j] != grid[i + len - k - 1][j]) {
                                check = false;
                                break;
                            }
                        }
                        if (check && answer < len) answer = len;
                    }
                }
            }
            ////test_case마다 tc를 입력 받으니까 갱신
            System.out.println("#" + tc + " " + answer);
        }
    }
}
