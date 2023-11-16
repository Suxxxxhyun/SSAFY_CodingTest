package saffy.Rugusee.sw;

import java.util.*;

public class sw_12712 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            if (1 <= n && n <= 49 && n % 2 == 0)
                return;

            int[][] arr = new int[n][n];
            int sum = 0;
            int len = n / 2;

            for (int i = 0; i < n; i++) {
                String str = sc.next();
                for (int j = 0; j < str.length(); j++) {
                    arr[i][j] = str.charAt(j) - '0';
                }
            }

            // 농장의 크기(n*n)를 2로 나누면 배열의 중앙 인덱스가 되므로 d를 더해주거나 빼면 삼각형의 크기를 구할 수 있다
            // 상단 삼각형: 제일 첫 줄의 중앙지점부터 한줄씩 올라가며 왼쪽 i칸 부터 오른쪽 i칸까지 수익을 더한다
            for (int i = 0; i < len; i++) {
                for (int j = len - i; j <= len + i; j++) {
                    sum += arr[i][j];
                }
            }

            // 하단 삼각형: 제일 마지막 줄의 중앙지점부터 한줄씩 올라가며 왼쪽 i칸 부터 오른쪽 i칸까지 수익을 더한다
            for (int i = len; i >= 0; i--) {
                for (int j = len - i; j <= len + i; j++) {
                    sum += arr[n - i - 1][j];
                }
            }

            // System.out.println(Arrays.deepToString(arr));
            System.out.println("#" + test_case + " " + sum);
        }
    }
}
