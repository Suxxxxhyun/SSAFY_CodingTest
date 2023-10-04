package saffy.bj;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName    : saffy.bj
 * fileName       : TestEratosthenes
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        qkrtn_ulqpbq2       최초 생성
 */
public class TestEratosthenes {

    public static boolean[] prime; // 소수판별 저장 배열
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        solve(num);

        for(int i=0; i<=num; i++){
            if(prime[i]){
                System.out.println("소수");
            } else {
                System.out.println("소수 아님");
            }
        }
    }

    public static void solve(int num){
        prime = new boolean[num + 1];
        Arrays.fill(prime, true);

        if(num < 2){
            return;
        }

        //0과 1은 소수가 아니다.
        prime[0] = prime[1] = false;

        for(int i=2; i<=Math.sqrt(num); i++){
            //이미 확인 되었다면 패스
            if(prime[i] == false){
                continue;
            }
            //배수부터 시작하여 다음 배수만큼 증가
            for(int j=i*i; j < prime.length; j = j + i){
                prime[j] = false;
            }
        }
    }
}
