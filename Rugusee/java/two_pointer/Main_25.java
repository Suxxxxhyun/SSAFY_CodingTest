package saffy.Rugusee.java.two_pointer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//3
//1 3 5
//5
//2 3 6 7 9
//투 포인터 활용
public class Main_25 {
    public ArrayList<Integer> solution (int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;

        //[v1,2]->[3,v2]->[3,v3]->[v3,6]->[v5,6]
        //1,2,3,3,5
        while (p1<n && p2<m) {
            //p1이 가르키는 값을 add하고 그다음에 p1이 하나 증가한다.
           if(arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
           else answer.add(arr2[p2++]);

        }

        //p1이 남아있는 경우 - arr1 배열이 남아 있는 경우
        while (p1<n) answer.add(arr1[p1++]);

        //p2이 남아있는 경우 - arr2 배열이 남아 있는 경우
        //6,7,9 -> add
        while (p2<m) answer.add(arr2[p2++]);

        return answer;
    }

    public static void main(String[] args) {
        Main_25 main = new Main_25();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i=0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i=0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        for (int x: main.solution(n, m, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}



//일차원 배열로 합치기
//public class Main_25 {
//    public int[] solution (int[] arr1, int[] arr2) {
//        int[] answer =  new int[arr1.length + arr2.length];
//
//        for (int i=0; i<arr1.length; i++){
//            answer[i] = arr1[i];
//        }
//
//
//        for (int i=0; i<arr2.length; i++){
//            answer[arr1.length + i] = arr2[i];
//        }
//
//        Arrays.sort(answer);
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main_25 main = new Main_25();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr1 = new int[n];
//
//        for (int i=0; i<arr1.length; i++){
//            arr1[i] = sc.nextInt();
//        }
//
//        int m = sc.nextInt();
//        int[] arr2 = new int[m];
//
//        for (int i=0; i<arr2.length; i++){
//            arr2[i] = sc.nextInt();
//        }
//
//
//        for (int x: main.solution(arr1, arr2)) {
//            System.out.print(x + " ");
//        }
//    }
//}
