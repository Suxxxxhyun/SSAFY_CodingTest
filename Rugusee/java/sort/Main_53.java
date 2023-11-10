package saffy.Rugusee.java.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main_53 {
    //결정 알고리즘 - 이분 검색 이용, 중간 지점이 답으로써 가능한 답인가 확인, 답을 좁혀가는 것
    //결정 알고리즘은 더 좋은 답이 선택될 때까지 답을 좁혀가면서 반복하는 것
    //찾는 답이 lt부터 rt 사이의 값이 확실할 때 사용
    //lt <= rt
    public int count (int[] arr, int capacity) {
        int cnt=1, sum=0;
        for(int x : arr) {
            //곡의 합(노래를 차지하고 있는 용량)이 용량을 넘어가면 새로운 장 수가 필요
            if(sum + x > capacity) {
                cnt++;
                sum = x; //새로운 곡 넣기
            }
            else sum += x;
        }
        return cnt;
    }

    public int solution (int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); //max의 자료형이 optional이라 int형으로 형변환 필요
        int rt = Arrays.stream(arr).sum();

        while (lt<=rt) {
            int mid = (lt+rt)/2;
            if(count(arr, mid) <= m) {
                answer = mid;
                rt = mid-1; //범위를 좁혀나가기
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_53 main = new Main_53();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //곡의 수
        int m = sc.nextInt(); //M개의 DVD
        int[] arr = new int[n]; //라이브에서 부른 순서대로 부른 곡의 길이의 분 단위
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(main.solution(n, m, arr));
    }
}
