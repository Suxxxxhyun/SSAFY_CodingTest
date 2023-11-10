package saffy.Rugusee.java.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main_50 {
    public ArrayList<Integer> solution (int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        //깊은 복사를 해야지 tmp를 정렬해도 arr 값이 그대로 유지됨
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i=0; i<n; i++) {
            //인덱스 번호가 0번부터 라서 +1 해줘야됨
            if(arr[i] != tmp[i]) answer.add(i+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_50 main = new Main_50();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; //제일 앞에부터 일렬로 서있는 학생들의 키
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        for(int x : main.solution(n, arr)) System.out.print(x + " ");
    }
}
