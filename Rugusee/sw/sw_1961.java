package saffy.Rugusee.sw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sw_1961 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];

            //배열입력
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 회전 배열 저장
            // 첫번째 테스트케이스에서 시계방향으로 90도 회전 후 차례로 90도씩 더 회전한다
            //90 -> 180 -> 270
            int[][] result_90 = rotate(arr);
            int[][] result_180 = rotate(result_90);
            int[][] result_270 = rotate(result_180);

            System.out.println("#" + test_case);

            for (int i = 0; i < N; i++) {

                for (int j = 0; j < N; j++) {
                    System.out.print(result_90[i][j]);
                }
                // case1-case2
                System.out.print(" ");

                for (int j = 0; j < N; j++) {
                    System.out.print(result_180[i][j]);
                }
                // case2-case3
                System.out.print(" ");

                for (int j = 0; j < N; j++) {
                    System.out.print(result_270[i][j]);
                }
                // i번째 열마다 개행
                System.out.println();

            }
        }

    }

    // 90도 회전
    static int[][] rotate(int[][] arr) {
        int[][] result = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                //j(마지막 열에서 첫번째 열), i(첫번째 행에서 마지막 행)
                //마지막 열의 첫번째 요소부터 첫번째 열의 첫번째 요소를 차례로 배열에 추가한 다음
                //마지막 열의 마지막 요소부터 첫번째 열의 마지막 요소가 될 때까지 차례로 배열에 추가한다.
                result[i][j] = arr[arr.length - j - 1][i];
            }
        }

        return result;
    }

}
