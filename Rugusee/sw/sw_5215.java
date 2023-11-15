package saffy.Rugusee.sw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sw_5215 {
    static int N, L, max;
    static int[][] material;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken()); // 재료의 수
            L = Integer.parseInt(st.nextToken()); // 제한 칼로리

            material = new int[N][2];

            // 첫번째 재료 정보
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                material[i][0] = Integer.parseInt(st.nextToken()); // 맛에 대한 점수
                material[i][1] = Integer.parseInt(st.nextToken()); // 칼로리

            }

            max = 0;
            selectMaterial(0, 0, 0);
            System.out.println("#" + test_case + " " + max);
        }

    }

    static void selectMaterial(int index, int score, int cal) {
        // 칼로리 초과
        if (cal > L)
            return;
        // 주어진 제한 칼로리 이하의 조합
        if (cal <= L)
            max = Math.max(max, score);
        // 모두 조합을 확인
        if (index == N)
            return;

        // 이 재료를 사용할 때
        selectMaterial(index + 1, score + material[index][0], cal + material[index][1]);
        // 이 재료를 사용 안할 때
        selectMaterial(index + 1, score, cal);

    }
}
