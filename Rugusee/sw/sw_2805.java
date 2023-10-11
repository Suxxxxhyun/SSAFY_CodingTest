package saffy.Rugusee.sw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sw_2805 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                String str = br.readLine();
                int[] line = new int[N];
                for (int j = 0; j < N; j++) {
                    //char형의 문자들을 int형으로 변환
                    line[j] = str.charAt(j) - '0';
                }
                arr[i] = line;
            }

            int ans = 0;
            int start = N / 2;
            int end = N / 2;
            for (int i = 0; i < N; i++) {
                for (int j = start; j <= end; j++) {
                    ans += arr[i][j];
                }

                if (i < N / 2) {
                    //행의 절반 전 일 때
                    start -= 1; //시작을 줄이고
                    end += 1; //끝을 늘려서 열의 범위를 키운다.
                } else {
                    //행의 절반 후 일때
                    start += 1; //시작을 늘리고
                    end -= 1; //끝을 줄여서 열의 범위를 좁힌다.
                }
            }
            System.out.println("#" + test_case + " " + ans);
        }
    }
}
