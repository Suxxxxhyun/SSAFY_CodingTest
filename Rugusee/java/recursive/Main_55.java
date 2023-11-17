package saffy.Rugusee.java.recursive;

import java.util.Scanner;

public class Main_55 {
    //재귀함수: 자기자신을 호출해서 무한반복
    //재귀함수: if-else 구조로 풀기
    //재귀함수는 스택을 사용한다: 1(맨위)<-2<-3(맨아래) 순으로 스택에 저장됨
    //스택이 빌때까지 반복
    public void DFS(int n) {
        if (n == 0) return; //함수 종료 후 pop 되고 스택의 최상단으로 이동
        else {
            DFS(n - 1); //3->2->1(321) 순으로 종료 후
            System.out.print(n + " "); //스택의 최상단부터 3<-2<-1(123) 실행
        }

    }


    public static void main(String[] args) {
        Main_55 main = new Main_55();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        main.DFS(n);
    }
}
