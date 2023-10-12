package saffy.Rugusee.sw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sw_1979 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        // 주어진 퍼즐 모양에서 특정 길이 K를 갖는 단어가 들어갈 수 있는 자리의 수를 출력
        // 길이가 3 인 단어가 들어갈 수 있는 자리는 2 곳(가로 1번, 가로 4번)
        // 퍼즐의 각 셀 중, 흰색 부분은 1, 검은색 부분은 0 -> 1, 흰색 가능
        // 각행이나 각열이 연속으로 1이 K번째 만큼 나와야 ans에 1을 더함
        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken()); // 단어 퍼즐의 가로, 세로길이
            int K = Integer.parseInt(st.nextToken()); // 단어의 길이
            int[][] map = new int[N][N];
            int ans = 0;

            // 퍼즐의 모양(이차원 배열) 입력
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 행검사(가로)
            for (int i = 0; i < N; i++) {
                int temp = 0;
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 0) {
                        //(흰칸)1이 연속으로 K번만큼 나온 직후
                        if (temp == K) {
                            ans += 1;
                        }
                        //검은칸(0)이 나와 초기화
                        temp = 0;

                    } else {
                        //흰칸 나옴
                        temp += 1;
                    }
                }

                //마지막에 있어서 흰칸이 K번을 초과하면 무시
                if (temp == K) {
                    ans += 1;

                }

            }

            // 열검사(세로)
            for (int i = 0; i < N; i++) {
                int temp = 0;
                for (int j = 0; j < N; j++) {
                    if (map[j][i] == 0) {
                        if (temp == K) {
                            ans += 1;
                        }
                        temp = 0;

                    } else {
                        temp += 1;
                    }

                }
                if (temp == K) {
                    ans += 1;
                }

            }

            System.out.println("#" + test_case + " " + ans);
        }
    }
}
