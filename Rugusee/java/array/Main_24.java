package saffy.Rugusee.java.array;

import java.util.Scanner;

public class Main_24 {
    //4중 for문에 2차원 배열
    //멘토는 멘티의 등수보다 한번이라도 낮으면 안된다
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        //for i=1-4 -> 사람 명 수
        //for j=1-4 -> 사람 명 수
        //for k=0-2 -> k 테스트에서 i와 j의 등수를 찾음, 수학테스트 회차(m회차)
        //for s=0-3 -> 학생들의 테스트 결과(학생 등수)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                //i번째 학생과 j번째 학생이 짝이 될 수 있는지 판단
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) pi = s; //학생의 등수를 찾아줌
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++; //pi:멘토, pj:멘티 -> 성적이 앞서야 좋은것
                }
                if (cnt == m) { //테스트 갯수
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_24 main = new Main_24();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(main.solution(n, m, arr));
    }
}
