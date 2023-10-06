package saffy.Rugusee.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_14888 {

    static int n; // arr 개수 (2 ≤ n ≤ 11)
    static int[] arr; // arr 숫자들 (1 ≤ A ≤ 100)
    static int[] operator; //연산자 개수
    static int Max = Integer.MIN_VALUE; //최대
    static int Min = Integer.MAX_VALUE; //최소

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        operator = new int[4];

        //숫자 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //연산자 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            operator[i] = Integer.parseInt(st.nextToken());
        }

        backtracking(1, arr[0]);
        System.out.println(Max);
        System.out.println(Min);
    }

    //연산자의 개수를 통해 유망한 노드인지 가지치며 깊이우선탐색을 진행하며 depth가 꽉 차면
    //최대값과 최소값을 판단하고 반환하는 방식
    static void backtracking(int depth, int value){
        if(depth == n) { //depth가 n이 되면 최댓값 판별 후 return
            Max = Math.max(Max, value);
            Min = Math.min(Min, value);
            return;
        }

        for (int i=0; i<4; i++){ //operator 배열 탐색
            if(operator[i] > 0) { //해당 연산자가 1개 이상있는 경우에
                operator[i]--; //연산자를 사용할 것이기에 1을 빼준다.

                switch (i) {
                    case 0: // 연산자가 +면
                        // depth를 1 증가시키고 value값 계산(+) 후 dfs 호출
                        backtracking(depth+1, value+arr[depth]);
                        break;
                    case 1: // 연산자가 -면
                        // depth를 1 증가시키고 value값 계산(-) 후 dfs 호출
                        backtracking(depth+1, value-arr[depth]);
                        break;
                    case 2: // 연산자가 *면
                        // depth를 1 증가시키고 value값 계산(*) 후 dfs 호출
                        backtracking(depth+1, value*arr[depth]);
                        break;
                    case 3: // 연산자가 /면
                        // depth를 1 증가시키고 value값 계산(/) 후 dfs 호출
                        backtracking(depth+1, value/arr[depth]);
                        break;
                }
                //사용한 연산자를 다음 dfs에서 사용할 수 있도록 다시 되돌려 준다.
                //재귀 호출이 종료되면 다시 해당 연산자 개수를 복귀한다.
                operator[i]++;
            }
        }
    }
}
