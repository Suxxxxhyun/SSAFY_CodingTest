package saffy.Rugusee.sw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class sw_1959 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] A = new int[N]; // N 개의 숫자로 구성된 숫자열 A (i=1~N)
            int[] B = new int[M]; // M 개의 숫자로 구성된 숫자열 B (j=1~M)
            int total = 0; // 서로 마주보는 숫자들을 곱한 뒤 모두 더할 때 최댓값

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < A.length; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < B.length; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }

            // N > M 경우: A의 배열길이 > B의 배열길이, B를 움직이면서 A의 배열 요소와 곱해준다.
            if (N < M) {
                for (int i = 0; i < M - N + 1; i++) {
                    int temp = 0; //비교할 위치

                    //i가 1번 도는 동안 j가 n번 만큼 돌아
                    //A[i] 인덱스가 B[0] ~ B[j] 인덱스에 대입될 수 있게 한다.
                    for (int j = 0; j < N; j++) {
                        temp += A[j] * B[i + j]; //N개만큼동안 a배열과 b배열의 값을 곱해준다.
                    }
                    total = Math.max(total, temp);
                }

            }
            // M > N 경우: B의 배열길이 > A의 배열길이, A를 움직이면서 B의 배열 요소와 곱해준다.
            else if (N > M) {
                for (int i = 0; i < N - M + 1; i++) {
                    int temp = 0;
                    for (int j = 0; j < M; j++) {
                        temp += A[i + j] * B[j];
                    }
                    total = Math.max(total, temp);
                }

            }
            //N == M 경우: for문 한번만 돌려도됨
            else {
                int temp = 0;
                for (int i = 0; i < N; i++) {
                    temp += A[i] * B[i];
                }
                total = Math.max(total, temp);

            }

            System.out.println("#" + test_case + " " + total);
        }

    }
}
