package saffy.Rugusee.java.sort;

import java.util.Scanner;

public class Main_46 {
    public int[] solution (int n, int[] arr) {

        //버블 정렬은 한번의 턴을 통해서 제일 뒷 자리의 숫자를 정한다
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++) {
                //이웃한 두수를 비교
                //뒤의 숫자가 작으면 바꿔줌
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        Main_46 main = new Main_46();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int x : main.solution(n, arr)) System.out.print(x + " ");
    }
}
