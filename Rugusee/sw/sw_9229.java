package saffy.Rugusee.sw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sw_9229 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 과자 봉지의 개수
            int M = Integer.parseInt(st.nextToken()); // 무게 합 제한을 나타내는 자연수
            int[] arr = new int[N];
            int max = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken()); // 과자 봉지 무게
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int temp = arr[i] + arr[j];
                    //배열에 과자봉지들을 넣고 2개씩 합한 값이 M보다 작거나 같은 것 중에 최댓값을 찾는다.
                    if (temp <= M) {
                        max = Math.max(max, temp);
                    }
                }
            }

            // 한빈이가 들고 다닐수 있는 과자들의 최대 무게 합을 출력하라.
            // 한빈이는 과자를 “정확히” 두 봉지 사야 함에 유의하라.
            // 만약 한빈이가 두 과자를 들고 갈 방법이 없는 경우에는 -1을출력한다.
            if(max==0) System.out.println("#" + test_case + " " + -1);
            else System.out.println("#" + test_case + " " + max);
        }

    }
}
