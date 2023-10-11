package saffy.Rugusee.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sw_1208 {
    //1285, 1284, 1208, 1959
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = 10;
        int[] arr = new int[100];

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine()); // 덤프 횟수


            st = new StringTokenizer(br.readLine());
            for(int i=0; i<100; i++) {
                arr[i] = Integer.parseInt(st.nextToken());// 각 상자의 높이 값
            }

            ////정렬을 수행: arr[0] = min, arr[max] = max
            Arrays.sort(arr);

            //평탄화 작업
            // //맨앞의 값(arr[0])은 +1, 맨 뒤의 값(arr[99])은 -1의 연산을 dump 수 만큼 수행
            for(int i=0; i<n; i++) {
                arr[0]++;
                arr[99]--;
                Arrays.sort(arr);
            }

            //최고점과 최저점의 차이를 반환
            System.out.printf("# %d  %d\n", test_case , arr[99] - arr[0]);
        }

    }
}
