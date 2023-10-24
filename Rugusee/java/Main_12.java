package saffy.Rugusee.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main_12 {
    public String solution (int n, String str) {
        String answer = "";

        for(int i=0; i<n; i++){
            //#은 1로 *은 0으로 변환
            String tmp = str.substring(0,7).replace('#', '1').replace('*', '0');
            //2진수를 10진수화
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num; //num을 그대로 대입하면 숫자가 대입되나까 문자로 형변환 후 출력
            //System.out.println(tmp + " " + num);
            //str을 갱신해주지 않으면 0-7까지 자른 문자만 나오므로 7이후로 문자를 갱신해준다
            str = str.substring(7);
        }





        return answer;
    }

    public static void main(String[] args) {
        Main_12 main = new Main_12();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(main.solution(n, str));
    }
}
