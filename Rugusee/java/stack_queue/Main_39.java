package saffy.Rugusee.java.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Main_39 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0; //터진 인형 갯수 카운팅
        Stack<Integer> stack = new Stack<>();

        for (int pos : moves) {
            //행의 길이 반복
            for (int i = 0; i < board.length; i++) {
                //인형을 발견했는지 검사
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];//인형 번호
                    board[i][pos - 1] = 0;//인형을 찾았으면 0으로 표시
                    //스택의 상단과 인형을 비교
                    //같으면 2점 추가 후 스택에서 제거
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    }
                    //다른 인형이면 스택에 추가
                    else stack.push(tmp);
                    //if문이 참이되면 반복문을 멈추도 다음행으로 넘어가게 해야함
                    break;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main_39 main = new Main_39();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //행, 열
        //board[i][pos-1]
        //하나 꺼내면 찾은 인형은 지우고 스택에 인형을 담고 작동을 멈춘다(다음행으로 넘어간다)
        //스택에 최상단 인형과 꺼낸 인형이 같으면 터진다 -> 한번 터질 때 두개가 터지므로 2점씩 더한다

        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];

        //크레인을 작동시킨 위치가 담긴 배열, pos
        for (int i = 0; i < m; i++) moves[i] = sc.nextInt();

        System.out.println(main.solution(board, moves));

    }
}
