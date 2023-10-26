package saffy.Rugusee.java.array;

import java.util.Scanner;

public class Main_20 {
    //등수구하기 - 배열 비교(이중for문 이용)
    //i가 0일 때 j가 1-4까지 돌면서 arr[j] > arr[i] 때 i번째 학생의 등수를 증가시킨다
    //처음에 i번째 학생은 1등으로 지정하고(cnt=1)
    //i번째 학생보다 점수가 더 높은 사람이 나오면 cnt에 값을(1씩) 더해(cnt+=1) 등수를 내린다
    public int[] soltion(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) { //i번째 학생과 0-4학생(j번째 학생)을 비교
                    cnt++;
                }
            }
            answer[i] = cnt; //최종등수 갱신
        }

        return answer;
    }


    public static void main(String[] args) {
        Main_20 main = new Main_20();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int x : main.soltion(n, arr)) System.out.print(x + " ");
    }
}
