package saffy.Rugusee.sw;

import java.util.Scanner;

public class sw_1213 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int test_case=1; test_case<=1; test_case++) {
            int t = sc.nextInt();
            int cnt = 0;
            String s = sc.next();
            String str = sc.next();

            for(int i=0; i<=str.length()-s.length(); i++) {
                String tmp = str.substring(i, i+s.length()); //0번째 부터 s 길이만큼 자른후 s와 비교해 값이 존재하면 카운트
//                System.out.println("tmp: " + tmp + " " + i);


                if(tmp.equals(s)) cnt++;
            }

            System.out.println("#" + " " + test_case + " " + cnt);
        }
    }
}
