package saffy.Rugusee.java.two_pointer;

import java.util.Scanner;

//몫과 나머지 방법
//2자리로 15만드는 방법
//arr[0] = 1 + arr[1] = 2
//sum = 15-3 = 12 -> (arr[0] + sum / 2) + (arr[1] + sum / 2) = (1+6) + (2+6) = 7 + 8

//3자리로 15만드는 방법
//arr[0] = 1 + arr[1] = 2 + arr[3] = 3
//sum = 15-6 = 9
// -> (arr[0] + sum / 2) + (arr[1] + sum / 2) + (arr[2] + sum / 2) = (1+3) + (2+3) + (3+3) = 4 + 5 + 6

//4자리로 15만드는 방법 -> 각 4자리 배열에 sum/2로 나눈 값을 더해도 1 값이 남기 때문에 안된다.
public class Main_30 {
    public int solution(int n) {
        int answer = 0, cnt = 1;
        n--; //n-1=14

        while (n > 0) {
            //cnt=2 -> cnt=3 -> cnt=4 -> cnt=5
            cnt++;

            //n-2 = 12 -> 1과 2뺀 상태, 가능, n-3=9 -> 1과 2와 3을 뺀 상태, 가능
            //n-4=5 -> 1과 2와 3과 4을 뺀 상태, 몫이 나눠 떨어지지 않아서 불가능, 지나감
            //n-5=0 -> 1과 2와 3과 4과 5를 뺀 상태, 가능
            n = n - cnt;

            if(n%cnt==0){
                //System.out.println(n + " " + cnt); //0을 5로 나눠서 참이되나 확인
                answer++; //몫을 분배 가능
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main_30 main = new Main_30();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(main.solution(n));

    }
}
