package saffy.Rugusee.java.string;

import java.util.Scanner;

public class Main_05 {
    public String solution(String str) {
        String answer = "";
        char[] arr = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while (lt<rt){
            if(!Character.isAlphabetic(arr[lt])) lt++; //알파벳이 아닐때 lt를 증가
            else if (!Character.isAlphabetic(arr[rt])) rt--;
            else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(arr);
        return answer;
    }

    public static void main(String[] args) {
        Main_05 main = new Main_05();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(main.solution(str));
    }
}
