package saffy.Rugusee.java.two_pointer;

import java.util.Scanner;

//100,000 * 50,000 -> O(N * K) (X)
//100,000 -> O(N) (0)
//for문이 0-K전까지 돌면서 sum에 0-2의 합을 구한 다음 sum에 arr[i]를 더하고 arr[i-k](이전 sum 배열 첫번째 값)를 빼준다
public class Main_27 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, sum = 0;

        //첫번째 윈도우 만들기
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        answer = sum; //answer 값을 첫번째 sum 값으로 대입

        //두번째부터 마지막 윈도우까지 반복하며 k일 동안 최대 매출액 구하기
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }


    public static void main(String[] args) {
        Main_27 main = new Main_27();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(main.solution(n, k, arr));
    }
}
