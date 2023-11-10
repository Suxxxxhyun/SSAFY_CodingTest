package saffy.Rugusee.java.sort;

import java.util.Scanner;

public class Main_48 {
    public int[] solution(int size, int k, int[] arr) {
        //C[i] = C[i-1] 로 복사
        //hit가 발생하면 hit가 발생한 지점부터 1까지 반복
        //0 인덱스의 값을 1 인덱스로 복사 한 후 현재 작업의 값을 0 인덱스에 삽입
        //miss가 발생하면 끝에서 부터 반복
        //제일 뒤의 숫자(가장 오래된 숫자)를 지우고 한칸씩 땡긴 다음 맨앞에 현재 작업의 값을 삽입한다
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1;
            //hit면 그 인덱스 값으로 변하지만
            //miss 상황(캐시에 그 값이 없을 때)는 pos는 -1 그대로 값을 유지
            for (int i = 0; i < size; i++) if (x == cache[i]) pos = i; //hit인 경우 pos에 hit된 지점을 삽입
            //miss 상황
            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1]; //값을 땡겨온다
                }

            } else { //hit 처리
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1]; //값을 땡겨온다
                }
            }
            cache[0] = x; //miss 처리를 함, 현재 작업의 값을 갱신
        }

        return cache;
    }

    public static void main(String[] args) {
        Main_48 main = new Main_48();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); //캐시 사이즈
        int n = sc.nextInt(); //작업 횟수
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : main.solution(s, n, arr)) System.out.print(x + " ");
    }
}
