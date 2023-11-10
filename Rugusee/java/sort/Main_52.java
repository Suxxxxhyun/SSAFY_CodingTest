package saffy.Rugusee.java.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main_52 {
    //좁혀 나가기 -> 오름차순 정렬을 기준
    //중간 지점인 mid의 값을 (lt+rt) / 2로 해서 나온 몫을 인덱스 위치로 설정한 후
    //배열의 mid 값이 m 값과 일치하면 답을 찾은 것이라 answer = mid + 1하면 된다
    //배열의 mid 값이 m보다 크면, 찾는 값이 작은 쪽에 존재하는 것, lt는 배열의 시작에 위치시키고 rt를 mid-1해서 위치를 한칸 좁힌다
    //반대로 배열의 mid 값이 m보다 작으면, 찾는 값이 큰 쪽에 존재하는 것, lt를 mid+1 위치로 이동시키고 rt를 배열의 끝으로 이동시킨다
    //lt와 tr 값이 동등해질 때까지 반복, lt가 rt보다 커지면 중단
    public int solution (int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt=0, rt=n-1;

        while (lt<=rt) {
            int mid = (lt+rt) / 2;
            if(arr[mid] == m) {
                answer = mid+1;
                break;
            }
            if (arr[mid] > m) rt = mid-1;
            else lt = mid+1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_52 main = new Main_52();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        System.out.println(main.solution(n, m, arr));
    }
}
