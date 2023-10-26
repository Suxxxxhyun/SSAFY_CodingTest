package saffy.Rugusee.java.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_18 {
    public boolean isPrime (int num) {
        //1은 소수가 아니다
        if(num==1) return false;
        for (int i = 2; i < num; i++){
            //i는 num의 약수일 때
            if(num % i == 0) return false;
        }
        //i가 num의 약수가 아닐 때
        return true;
    }

    //뒤집어서 소수이면 동적배열에 할당
    public ArrayList<Integer> solution (int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        //숫자 뒤집기
        //예) tmp = 123, 뒤집은 결과 = res
        // t = tmp % 10
        // res = res * 10 + t = 0 * 10 + 0 -> 3 = 0 * 10 + 3 -> 32 = 3 * 10 + 2
        // tmp = tmp / 10 -> tmp를 10으로 나눠 각 자리수를 확인
        for (int i=0; i<n; i++){
            int tmp=arr[i];
            int res = 0;
            while (tmp>0) {
                //res 역으로 뒤집기
                int t = tmp % 10;
                res = res * 10 + t;
                tmp /= 10;
            }
            if(isPrime(res)) answer.add(res);
        }

        return answer;
    }


    public static void main(String[] args) {
        Main_18 main = new Main_18();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int x : main.solution(n, arr)) {
            System.out.print(x + " ");
        }

    }
}
