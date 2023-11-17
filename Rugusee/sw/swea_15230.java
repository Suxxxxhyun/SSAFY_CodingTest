package saffy.Rugusee.sw;


import java.util.ArrayList;
import java.util.Scanner;

public class swea_15230 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //abcdefghijklmnopqrstuvwxyz
        //a부터 순서대로 일치하는 알파벳 개수를 계산

//        for (int test_case = 1; test_case <= t; test_case++) {
//            String str = sc.next();
//            char[] arr = new char[26];
//            ArrayList<Character> list = new ArrayList<>();
//            int cnt = 0;
//
//            for (int i = 0; i < 26; i++) {
////                arr[i] = (char) ('a' + i);
//                arr[i] = (char) (i + 97); //a-z: 97-122, A-Z:65-90, (char) 1-9 48-57
//            }
//
//
//            for(int i=0; i<str.length(); i++) list.add(str.charAt(i));
//
//            //입력 된 5문장의 str로 생성된 5개의 list를 첫번째 문장부터 마지막 문장까지 알파벳을 순서대로 검사
//            for (int i = 0; i < list.size(); i++) {
//                if(arr[i] == list.get(i)) cnt++;
//                else if (arr[i] != list.get(i)) break;
//            }

        //v2
        for (int test_case = 1; test_case <= t; test_case++) {
            String str = sc.next();
            String alpha = "abcdefghijklmnopqrstuvwxyz";
            int cnt = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == alpha.charAt(i)) cnt++;
                else if (str.charAt(i) != alpha.charAt(i)) break;
            }

            System.out.println("#" + test_case + " " + cnt);
        }


//            System.out.println("#" + test_case + " " + cnt);
//            for(char x : arr) System.out.print(x + " ");


    }

}
