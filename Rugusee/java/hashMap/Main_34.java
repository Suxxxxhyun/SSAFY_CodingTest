package saffy.Rugusee.java.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//투포인터, 슬라이딩 윈도우
public class Main_34 {
    public ArrayList<Integer> solution (int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int lt=0, sum=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<k-1; i++){
            //key가 있으면 value만 추가하고 없으면 key를 생성 후 value 추가
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        //k일 때부터 시작, map에 key, value 값 추가 하고 answer에 size 값 추가하기
        for (int rt=k-1; rt<n; rt++) {
            //위에서 3개의 인덱스 값을 map에 넣은 후 마지막 인덱스를 map에 넣어서
            //첫번째 구간을 완성하고 키의 길이를 answer에 넣는다
            //나머지 구간은 lt를 증가 시킨 다음 value 값을 감소시켜
            //구간을
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            //key 갯수
            answer.add(map.size());
            //다시 세팅
            map.put(arr[lt], map.getOrDefault(arr[lt], 0) - 1);
            //윈도우 상에 value가 존재하지 않으면 key를 삭제
            if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_34 main = new Main_34();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); //연속된 길이
        int[] arr = new int[n];

        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        for(int x : main.solution(n, k, arr)) System.out.print(x + " ");
    }
}
