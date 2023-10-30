package saffy.Rugusee.java.two_pointer;

import java.util.Scanner;

//이중 반복문을 돌면 시간복잡도는 O*n제곱이 된다
// -> 이 문제는 n의 값이 10,000까지 제한되어서 시간 복잡도가 O(N제곱)이 되면 시간 초과된다
// -> 이 문제의 시간 복잡도는 O(N)이 되어야 한다
// 특정 연속 부분의 구간을 lt ~ rt까지이다
// lt ~ rt 부분까지의 연속된 합이 특정 숫자 m이 되는 가를 확인해야함
// sum: lt ~ rt 부분까지의 연속 부분 수열의 합 -> sum의 값이 m과 같은지 rt의 마지막 인덱스까지 확인해야함
// lt ~ rt 값 < m: rt 인덱스 증가 후 이전 rt 값 빼기 후 확인
// lt ~ rt 값 > m: lt 인덱스 증가 후 이전 lt 값 빼기 후 확인
// lt ~ rt 값 == m: 카운팅 후 lt 인덱스 증가 후 이전 lt 값 빼기 후 확인
public class Main_28 {
    public int solution (int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt=0;

        //rt가 증가하며 lt가 쫓아옴, 1.lt or rt 값 증가
        for (int rt=0; rt<n; rt++){
            sum += arr[rt]; //lt~rt 까지의 합, 2.lt ~ rt 값 더하고
            if(sum==m) answer++;

            //3.확인
            //sum이 m과 같지 않은 경우가 있을 때 lt를 하나보다 더 빼야한다.
            while (sum >= m) {
                sum -= arr[lt++];
                if(sum==m) answer++; //lt 값을 빼서도 sum 값이 변경되니까 sum 값을 확인해줘야됨
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_28 main = new Main_28();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        System.out.println(main.solution(n, m, arr));
    }
}
