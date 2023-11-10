package saffy.Rugusee.java.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main_54 {
    //arr[i] - ep >= mid : mid보다 크거나 같은 구간에만 말을 배치가능
    //mid 값이 유효한지 아닌지 확인
    //두 말의 최대 거리를 구하는 것
    public int count(int[] arr, int dist) {
        int cnt = 1; //배치한 말의 마리 수
        int ep = arr[0];
        for(int i=1; i<arr.length; i++) {
            //dist 보다 크거나 같으면 arr[i] 지점에 배치 가능
            if(arr[i] - ep >= dist) {
                cnt++;
                ep =  arr[i];
            }
        }
        return cnt;
    }

    public int solution (int n, int c, int[] arr) {
        int answer = 0; //배치 가능한 말의 마리 수
        Arrays.sort(arr);
        int lt=1;
        int rt=arr[n-1];
        while (lt<=rt) {
            int mid = (lt+rt)/2;
            if(count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }


        return answer;
    }

    public static void main(String[] args) {
        Main_54 main = new Main_54();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //마구간의 좌표
        int c = sc.nextInt(); //마구간에 배치해야 할 말의 마리 수
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(main.solution(n, c, arr));
    }
}
