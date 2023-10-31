package saffy.Rugusee.java.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Main_35 {
    public int solution (String str1, String str2) {
        int answer = 0, lt = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for(char x : str2.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) + 1);

        int len = str2.length() -1;
        //am을 0부터 len-1까지만 추가
        for (int i=0; i<len; i++) am.put(str1.charAt(i), am.getOrDefault(str1.charAt(i), 0) + 1);


        //len부터 카운트
        //str2의 문자를 하나씩 map2에 추가 후에
        //str1의 문자를 str2.length()-1 까지 map1에 추가한 후에
        //str2.length() 위치부터 map2에 문자를 추가한 다음 str1과 str2의 문자들을 map을 통해 비교한다
        //비교 후에 rt와 lt를 증가시키면서
        // key가 존재하면 value 값을 감소, 존재하지 않으면 key 생성 후 value 값을 증가
        for (int rt=len; rt<str1.length(); rt++) {
            //rt가 가르키는 값을 am에 put한다
            am.put(str1.charAt(rt), am.getOrDefault(str1.charAt(rt), 0) + 1);
            //am의 크기가 미리 추가해둔 bm과 같아져서 비교가능
            if (am.equals(bm)) answer++;
            //lt가 가르키는 값에 key 값 찾아서 이미 존재하면 am에서 value 값을 빼줘야됨
            am.put(str1.charAt(lt), am.get(str1.charAt(lt)) - 1);
            //lt가 가르키는 값에 am의 key 값이 존재하지 않으면 제거
            if(am.get(str1.charAt(lt))==0) am.remove(str1.charAt(lt));
            lt++;
        }


        return answer;
    }

    public static void main(String[] args) {
        Main_35 main = new Main_35();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(main.solution(str1, str2));
    }
}
