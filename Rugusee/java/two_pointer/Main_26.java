package saffy.Rugusee.java.two_pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//교집합, 공통원소 구하기 -> 오름차 순으로 출력하기
//5
//1 3 9 5 2
//5
//3 2 5 7 8
//arr1[p1(0)]: 1 < arr2[p2(0)]: 2  -> arr1과 arr2 중에 더 작은 값을 배열에 추가
//arr1[p1(1)]: 2 == arr2[p2(0)]: 2 -> arr1 or arr2에 추가후 동시에 인덱스 값 증가
//arr1[p1(2)]: 3 == arr2[p2(1)]: 3 -> 추가후 동시에 인덱스 값 증가
//arr1[p1(3)]: 5 == arr2[p2(2)]: 5 -> 추가후 동시에 인덱스 값 증가
//arr1[p1(4)]: 9 > arr2[p2(3)]: 7 -> 추가후 동시에 인덱스 값 증가
//arr1[p1(4)]: 9 > arr2[p2(4)]: 8 -> arr2 배열에 추가
public class Main_26 {
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1); //오름차순 정렬
        Arrays.sort(arr2); //오름차순 정렬
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (arr1[p1] == arr2[p2]){ //값이 같은 경우
                answer.add(arr1[p1++]);
                p2++;
            }
            else if (arr1[p1] < arr2[p2]) p1++; //arr1이 값이 작은 경우
            else p2++; //arr1이 값이 큰 경우

        }


        return answer;
    }

    public static void main(String[] args) {
        Main_26 main = new Main_26();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int x : main.solution(n, m, arr1, arr2)) {
            System.out.print(x + " ");
        }

    }
}
