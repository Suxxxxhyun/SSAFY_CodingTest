package saffy.Rugusee.java.two_pointer;

import java.util.Scanner;

//cnt: 0을 1로 바꾼 횟수, k가 넘어가면 안된다
//rt가 0을 1로 바꾸고 나면 lt는 1을 0으로 바꾼다
//rt: 연속 수열의 값을 구한다
//1을 연속적으로 가지고 있는 수열의 값: rt - lt + 1
//answer: 최댓 값을 찾아야 하니까 0으로 초기화
//lt: 값을 바꾸고 인덱스 증가
//cnt: 0을 1로 바꾼 횟수
public class Main_31 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;

        //인덱스 값이 0일 때
        // 값이 증가할 때마다 연속 수열의 값을 구한다
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                cnt++; //rt가 0을 만나면 이 지점을 1로 바꾸기 때문에 증가
            }

            //인덱스 값이 1일 때
            while (cnt > k) { //cnt가 k보다 크면 계산하면 안된다
                if (arr[lt] == 0) cnt--; //rt가 0을 1로 바꾼 지점을 1로 되돌려놓는다
                lt++; //0을 찾을 때까지 증가
            }

            //조정을 한 후에 길이를 구한다, 최대 값을 구한다
            answer = Math.max(answer, rt - lt + 1);

        }


        return answer;
    }

    public static void main(String[] args) {
        Main_31 main = new Main_31();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(main.solution(n, k, arr));
    }
}
