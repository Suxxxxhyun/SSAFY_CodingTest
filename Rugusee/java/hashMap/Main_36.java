package saffy.Rugusee.java.hashMap;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main_36 {
    public int solution(int n, int k, int[] arr) {
        int answer = -1; //k번째 수가 존재하지 않을 때
        // treeset - 중복제거, 정렬
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        //N장의 카드 중 3장 -> 3중 for 문
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { //i와 중복되면 안되니까 i+1부터 시작
                for (int l = j + 1; l < n; l++) {
                    //Tset에 3개 뽑힌 값을 더해준다
                    //3개의 값을 뽑아 합한 값
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
//        Tset.remove(143); //제거
//        System.out.println(Tset.size()); //원소의 갯수 출력
//        System.out.println(Tset.first()); //제일 앞의 자료: 오름차 순일 때 - 최솟값, 내림차 순일 때 - 최대값
//        System.out.println(Tset.last()); //제일 뒤의 자료

        for (int x : Tset) {
            cnt++; //x의 순서
            if (cnt==k) return x;  //k번째 수
//            System.out.println(cnt + "-" + x);
        }

        return answer;
    }


    public static void main(String[] args) {
        Main_36 main = new Main_36();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(main.solution(n, k, arr));
    }
}
