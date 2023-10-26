package saffy.Rugusee.java.array;

import java.util.*;

public class Main_13 {
    //N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>(); //출력하는 것들
        answer.add(arr[0]); //0번째는 무조건 출력

        //왼쪽 인덱스 값 보다 오른쪽인덱스 값이 크면 리스트에 오른쪽 인덱스 값 추가
        for (int i=1; i<n; i++) if(arr[i] > arr[i-1]) answer.add(arr[i]);

        return answer;
    }

    public static void main(String[] args) {
        Main_13 main = new Main_13();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //첫 줄에 자연수 N
        int[] arr = new int[n]; //N개의 정수
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        for (int x: main.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
