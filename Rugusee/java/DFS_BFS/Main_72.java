package saffy.Rugusee.java.DFS_BFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main_72 {
    //거슬러 줄 동전의 최소 개수
    //0, 0
    //D(1, 1) D(1, 2) D(1, 5)
    //D(2, 2), D(2, 3)... / D(2, 3)... /...
    //D(3, 5).../ ... / ...
    //D(4, 10).../ ... / ...
    //D(5, 15).../ ... / ...
    //sum을 만들기 위해 사용 된 갯수는 L, sum == m이 될 때 멈춤
    static int n, m, answer = Integer.MAX_VALUE;

    public void DFS(int L, int sum, Integer[] arr) {
        if (sum > m) return; //무한 안넘어가려면 조건 필요
        if (L >= answer) return; //큰 금액부터 적용해서 답을 찾으면 적은 금액의 경우 안보기(메모리 절약)
        if (sum == m) {
            //sum을 만들어 내는 동전의 갯수: L
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i], arr); //i번째 동전을 사용
            }
        }
    }

    public static void main(String[] args) {
        Main_72 main = new Main_72();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //동전 종류 개수
        Integer[] arr = new Integer[n]; //Collections.reverseOrder 사용하려면 객체형 Integer로 선언해야함
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt(); //동전의 종류
        Arrays.sort(arr, Collections.reverseOrder());//내림차순 정렬하기
        m = sc.nextInt(); // 거슬러 줄 금액
        main.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
