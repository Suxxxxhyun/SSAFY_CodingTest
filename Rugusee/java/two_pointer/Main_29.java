package saffy.Rugusee.java.two_pointer;

import java.util.Scanner;

// (n/2)+1의 숫자까지 만의 연속된 합만 구하면 된다.
public class Main_29 {
    public int solution(int n) {
        int answer = 0, sum = 0, lt = 0;
        int m = n / 2 + 1; //연속된 자연수가 어디까지 필요한지
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) arr[i] = i + 1; //0번 인덱스에 1 값이 들어감

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];

            if (sum == n) answer++;

            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main_29 main = new Main_29();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(main.solution(n));

    }
}
