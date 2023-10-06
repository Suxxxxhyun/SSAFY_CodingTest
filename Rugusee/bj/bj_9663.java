package saffy.Rugusee.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_9663 {
    // 체스판 크기가 주어지면 해당 체스판 안에서 퀸이 서로 공격할 수 없도록
    // 배치하는 경우의 수를 찾으면 되는 문제이다.
    // 각 행 별로 놓을 수 있는 위치에 있을 때 재귀호출을 해주고,
    // 만약 모두 배치 되었다면 count 를 해주면서 경우의 수를 찾아내면 된다.
    // 퀸이 이동할 수 있는 위치: 상하좌우 및 대각선, 거리 제한 없이 한 방향으로 이동이 가능
    static int[] arr;
    static int n;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        nQueen(0);
        System.out.println(cnt);
    }

    // 1. 재귀호출을 어떻게 할 것인가
    // 2. 퀸을 놓을 수 있는지 여부를 어떻게 조건문으로 판별 할 것인가
    // 각 원소의 index를 '열'이라 생각하고, 원소 값을 '행'이라 생각
    //-> 1차원 배열에 각 인덱스(위치)는 '열'을 가리키고, 해당 인덱스의 값은 '행'을 의미
    //즉, 재귀탐색을 하게되면 기본적으로 '열'은 서로 다른 위치이니 우리가 검사할 것은
    // 다른 퀸과 동일한 '행'에 위치하는지와 대각선상에 위치하는지를 검사하면 된다.
    // 만약 해당 위치가 공격받지 않는 위치라면 다음 재귀를 호출하고,
    // 아닐경우는 다음 반복문으로 넘어간다.
    static void nQueen(int depth) {
        //모든 원소를 다 채운 상태면 cnt 증가 및 return
        if (depth == n) {
            cnt++;
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[depth] = i;
            //놓을 수 있는 위치일 경우 재귀호출
            if (Possibility(depth)) {
                nQueen(depth + 1);
            }
        }
    }

    static boolean Possibility(int col) {
        for (int i = 0; i < col; i++) {
            //해당 열의 행과 i열의 행이 일치할 경우(같은 행에 존재할 경우)
            if (arr[col] == arr[i]) {
                return false;
            }

            //대각선 상에 놓여있는 경우
            //열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우이다
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }

        //공격받지 않는 위치라면 다음 재귀를 호출
        return true;
    }


}
