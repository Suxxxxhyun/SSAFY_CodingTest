package saffy.Rugusee.java.sort;

import java.util.Scanner;

public class Main_47 {
    public int[] solution(int n, int[] arr) {

        //j는 i-1 지점부터 0까지 하나씩 작아지면서 반복
        //arr[j]가 tmp 보다 크면 값을 뒤로 밀어줌 -> arr[j+1] = arr[j]
        for (int i = 0; i < n; i++) {
            //삽입돼서 들어가기 위해 임시로 숫자를 저장
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                //앞 숫자가 뒤의 숫자보다 클 때
                if (arr[j] > tmp) arr[j + 1] = arr[j];
                else break;
            }
            //더 큰 숫자를 j+1에 저장
            arr[j + 1] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Main_47 main = new Main_47();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : main.solution(n, arr)) System.out.print(x + " ");
    }
}
