package saffy.Rugusee.java.recursive;

import java.util.Arrays;
import java.util.Scanner;

public class Main_58 {
    //피보나치 수열은 재귀보다 반복문으로 작성하는게 메모리 효율과 시간 효율에 더낫다
    //재귀 호출보단 배열에 저장해서 한번만 출력하게 하면 8초만에 출력
    //memorization을 활용하면 1초만에 출력 가능
    static int[] fibo;

    public int DFS(int n) {
        //v3 - 메모라이제이션
        if (fibo[n] > 0) return fibo[n];

        if (n == 1) return fibo[n] = 1; //D(1)
        else if (n == 2) return fibo[n] = 1; //D(1)
        else {
            //v1
            // return DFS(n-2) + DFS(n-1); //D(3) = D(1) + D(2), D(4) = D(2) + D(3)....D(n) = D(n-2) + D(n-1)
            //v2
            //fibo 배열에 기록된 값을 리턴하는 행태
            //v3 - 메모라이제이션, 이미 구한 값을 다시 구할 필요 없음
            //fibo 배열에 값이 존재하면(0보다 크면) 값을 기록하지 않고 구한 값을 바로 리턴
            return fibo[n] = DFS(n - 2) + DFS(n - 1);

        }

    }

    //반복문 이용
    public int recursive(int n) {

        int sum = 0;
        int prev = 1;
        int cur = 1;

        if (n == 1) return 1;
        else if (n == 2) return 1;
        else {
            for (int i = 3; i <= n; i++) {
                sum = prev + cur;
                prev = cur;
                cur = sum;
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        Main_58 main = new Main_58();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo = new int[n + 1];
        //재귀
        main.DFS(n);
        //반복
        main.recursive(n);

        //v1
//        for(int i=1; i<=n; i++) System.out.print(main.DFS(i) + " ");
        //v2
        for (int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
        System.out.println();
        for (int i = 1; i <= n; i++) System.out.print(main.recursive(i) + " ");

    }
}
