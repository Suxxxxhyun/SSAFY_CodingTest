package saffy.Rugusee.java.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main_49 {

    //nlogn
    public String solution (int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);

        //이웃한 두 수를 확인
        for(int i=0; i<n-1; i++) {
            if(arr[i] == arr[i+1]) {
                return  "D";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_49 main = new Main_49();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        System.out.println(main.solution(n, arr));
    }
}
