package saffy.Rugusee.java.array;

import java.util.Scanner;

public class Main_22 {
    //2차원 배열을 돌면서 각 지점마다 자기보다 크거나 같은 것이 있으면 지나치고 없으면 봉우리
    //방향배열
    //시계방향으로 회전
    int[] dx = {-1, 0, 1, 0}; //위, 아래
    int[] dy = {0, 1, 0, -1}; //오른쪽, 왼쪽

    public int solution(int n, int[][] arr) {
        int answer = 0;

        //arr[nx][ny]
        //arr[nx-1][ny+0]: 현재위치에서 윗 칸
        //arr[nx+0][ny+1]: 현재위치에서 오른쪽 칸
        //arr[nx+1][ny+0]: 현재위치에서 아랫 칸
        //arr[nx+0][ny-1]: 현재위치에서 왼쪽 칸
        //nx = i + dx -> i번째 행에 dx를 더해 현재 행의 위치를 바꾼다
        //ny = j + dy -> j번째 행에 dy를 더해 현재 열의 위치를 바꾼다

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true; //봉우리 참,거짓 여부 판단
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k]; //4방향을 보기 위한 행 좌표
                    int ny = j + dy[k]; //4방향을 보기 위한 열 좌표
                    //봉우리 판단 - 현재위치에서 네방향에서 하나라도 큰 숫자가 있으면 거짓 처리
                    //반복문 탈출하고 다른 위치에서 봉우리 판단
                    //nx와 ny가 경계선 밖에 있으면 안되기 때문에 조건 필요
                    //: 봉우리 판단하는 코드 전에 있어야 미리 조건을 검증할 수 있다
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++; //봉우리가 맞으면 값을 증가
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
