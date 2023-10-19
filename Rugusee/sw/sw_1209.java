package saffy.Rugusee.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class sw_1209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[100][100];

            // 100X100의 2차원 배열 입력
            for (int i = 0; i < 100; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            //합 구하고 비교
            int dia1 = 0;
            int dia2 = 0;
            int max = -1;
            for (int k = 0; k < 100; k++) {
                //새로운 열과 행마다 초기화 필요
                int row = 0;
                int col = 0;
                for (int l = 0; l < 100; l++) {
                    row += arr[k][l]; // 행의 합
                    col += arr[l][k]; // 열의 합
                }
                max = Math.max(max, Math.max(row, col));

                dia1 += arr[k][k]; // 왼쪽->오른쪽 대각선의 합
                dia2 += arr[k][99-k]; // 오른쪽-> 왼쪽 대각선의 합
            }
            max = Math.max(max, Math.max(dia1, dia2));

            System.out.println("#" + test_case + " " + max);

        }

    }

}
