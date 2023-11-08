package saffy.Rugusee.java.sort;

import java.util.Scanner;

public class Main_45 {
    public int[] solution(int n, int[] arr) {

        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                //작은 값 찾기
                //1회차: 5 13 11 7 23 15
                //5 < 13 j = 5, idx = 13, 11 < 5 j = 11, idx = 5...
                // 13 < 5 j = 13, idx = 5...
                if (arr[j] < arr[idx]) idx = j; //i번째 부터 오름차순으로 담김
            }
            //i번째에 들어올 숫자를 찾고있음
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Main_45 main = new Main_45();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : main.solution(n, arr)) System.out.print(x + " ");
    }
}
