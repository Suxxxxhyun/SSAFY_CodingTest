package saffy.Rugusee.sw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sw_1860 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine(), " ");
            // K개의 붕어빵 += M초의 시간
            int N = Integer.parseInt(st.nextToken()); // 맛 볼 자격있는 사람들 의 수
            int M = Integer.parseInt(st.nextToken()); // 붕어빵 만드는데 걸리는 시간
            int K = Integer.parseInt(st.nextToken()); // 붕어빵의 갯수
            int[] arr = new int[N];
            int total = 0;

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                // N개의 정수가 공백으로 구분되어 주어지며,
                // 각 정수는 각 사람이 언제 도착하는지를 초 단위로 나타낸다.
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            for (int i = 0; i < N ; i++) {
                //손님이 도착하는 시간
                int temp = arr[i];
                //arr[i] 초에 진기가 만든 붕어빵의 개수
                int sum = K * (temp/M);
                //arr[i] 초에 만든 붕어빵의 개수가 arr[i] 초에 도착한 손님 수보다 작을 때
                if(sum < (i+1)) total = 1;
            }

            // 모든 손님에 대해 기다리는 시간이 없이 붕어빵을 제공할 수 있으면
            // “Possible”을, 아니라면 “Impossible”을 출력
            if(total == 0) System.out.println("#" + test_case + " " + "Possible");
            else System.out.println("#" + test_case + " " + "Impossible");

        }

    }
}
