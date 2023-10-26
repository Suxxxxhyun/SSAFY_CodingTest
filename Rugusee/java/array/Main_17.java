package saffy.Rugusee.java.array;

import java.util.Scanner;

public class Main_17 {
    public int solution (int n) {
        int answer = 0;
        int[] ch = new int[n+1];

        //소수 구하기
        //1. 2의 배수 확인
        //2. 3의 배수 확인
        //3. 자기 자신을 약수로 갖는 수를 확인한다
        for(int i=2; i<=n; i++){
            if(ch[i]==0){
                answer++;
                for (int j=i; j<=n; j=j+i) ch[j]=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_17 main = new Main_17();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(main.solution(n));

    }
}
