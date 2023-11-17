package saffy.Rugusee.java.recursive;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_62 {
    //점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
    //점프 최소 횟수 - 노드의 레벨 값
    //5 - L0(루트)
    //6, 4, 10 - L1(루트에서 1번만에 갈 수 있는 지점)
    //7, 11/ 3, 9/ 15- L2(루트에서 2번만에 갈 수 있는 지점)
    //8, 12/ 16/ 2, 14(위치 발견 후 종료)/ (루트에서 3번만에 갈 수 있는 지점)

    int answer = 0; //점프 최소 횟수
    int[] dis = {1, -1, 5}; //이동 범위
    int[] ch; //체크 배열 - 방문 여부(시간 복잡도를 위해 한번 방문한 배열을 넣지 않는다)
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0; //root

        while (!Q.isEmpty()) {
            int len = Q.size();
            for(int i=0; i<len; i++) {
                int x = Q.poll();

                for(int j=0; j<3; j++) {
                    int nx = x + dis[j];
                    //Q에 값을 추가 전 점프 최소 횟수를 확인
                    //nx: x의 자식 L: 자식노드
                    if(nx==e) return L+1;

                    //nx가 방문 안한 경우, 음수 아닐 때
                    if(nx>=1 && nx <= 10000 && ch[nx]==0) {
                        ch[nx] = 1; //방문 처리
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;

    }


    public static void main(String[] args) {
        Main_62 main = new Main_62();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(main.BFS(s, e));

    }
}
