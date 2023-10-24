package saffy.Rugusee.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_5766 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[] score = new int[100001];

        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            score = new int[10001];

            //0 0이 입력되기 전까지 무한반복
            if(n==0 & m==0) break;

            //점수 계산
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    int idx = Integer.parseInt(st.nextToken());
                    ///입력값으로 들어오는 선수들의 번호를 인덱스로 하는 배열의 수를 +1증가
                    score[idx]++;
                }
            }

            //1등 점수 확인
            for (int i = 0; i < score.length; i++) {
                first = Math.max(score[i], first);
            }

            //2등 점수 확인
            for (int i = 0; i < score.length; i++) {
                if (score[i] != first) second = Math.max(score[i], second);
            }

            //케이스별 2등 확인
            //2등인 선수 확인
            for (int i = 0; i < score.length; i++) {
                if (score[i] == second) sb.append(i + " ");
            }
            //하나의 케이스가 끝나면 개행
            sb.append("\n");

        }
        //각 케이스 마다 저장한 2등을 출력
        System.out.println(sb.toString());

    }
}
