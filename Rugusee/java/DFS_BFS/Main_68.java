package saffy.Rugusee.java.DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_68 {
    //1, 3, 5, 6, 7, 10 (0|1|2|3|4|5)
    //(0, 0)
    //0번 인덱스 사용O: D(레벨1, 1) 0번 인덱스 사용X:D(1, 0)
    //1번 인덱스 사용O: D(2, 4) 1번 인덱스 사용XD(2, 1)
    static String answer = "NO";
    static int n, total=0;
    boolean flag = false; //yes가 되면 그 다음 재귀를 모두 return 시켜주기 위한 것

    public void DFS (int L, int sum, int[] arr) {
        if(flag) return; //flag가 true가 되면 모두 return
        if(sum>total/2) return;
        if(L==n) {
            //sum이 total의 절반일 때
            if((total-sum)==sum) {
                answer = "YES";
                flag = true;
            }
        }
        else {
            DFS(L+1, sum+arr[L], arr); //L번째가 가르키는 부분을 부분 집합에 포함하겠다
            DFS(L+1, sum, arr); //L번째가 가르키는 부분을 부분 집합에 포함안한다
        }

    }

    public static void main(String[] args) {
        Main_68 main = new Main_68();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        main.DFS(0, 0, arr);
        System.out.println(answer);
    }


}


