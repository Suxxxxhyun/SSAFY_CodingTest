package saffy.Rugusee.java.array;

import java.util.Scanner;

public class Main_14 {
    public int soltion (int n, int[] arr){
        //최대값과 같은 값은 카운트 안함
        //첫번째 사람은 무조건 보이니까 1로 초기화
        int answer = 1;

        //첫번일 때는 비교대상이 없으므로 일단 첫번째로 초기화
        //이후에 가장 키가 큰 학생의 인덱스로 갱신
        int max = arr[0];

        //두번째 사람부터
        //오른쪽 인덱스 값이 왼쪽 인덱스 값보다 크면 카운트
        for (int i=1; i<arr.length; i++){
            //자기 앞에 있는 학생들 중에 가장 큰 사람보다 크다면 카운트
            if(max < arr[i]) answer++;
            max = Math.max(max, arr[i]);
        }
        System.out.println("arr.length: " + arr.length);
        System.out.println("n: " + n);
        return answer;

    }

    public static void main(String[] args) {
        Main_14 main = new Main_14();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(main.soltion(n, arr));

    }
}
