package saffy.Rugusee.java.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Main_33 {
    public String solution (String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x: str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x: str2.toCharArray()) {
            //key가 존재하지 않거나 value가 0이면 NO
            if(!map.containsKey(x) || map.get(x)==0) return "NO";

            map.put(x, map.get(x)-1); //key가 존재하면 value 값을 하나 감소
        }


        return answer;
    }

    public static void main(String[] args) {
        Main_33 main = new Main_33();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(main.solution(str1, str2));
    }
}
