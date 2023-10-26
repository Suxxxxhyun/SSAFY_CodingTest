package saffy.Rugusee.java.array;

import java.util.Scanner;

public class Main_22 {
    //2차원 배열을 돌면서 각 지점마다 자기보다 크거나 같은 것이 있으면 지나치고 없으면 봉우리

    public int solution(int n, int[][] arr) {
        int answer = 0;
        //방향배열
        int[] dx = {-1, 0, 1, 0}; //0-3
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {


            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Main_22 main = new Main_22();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(main.solution(n, arr));
    }
}
