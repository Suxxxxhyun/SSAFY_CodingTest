package saffy.Rugusee.java.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//key: 문자, value: 정수
public class Main_32 {
    public char solution (int n, String str) {
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();

        //투표용지에 쓰여있던 각 기호를 문자 배열로 만들어서 map에 put(추가)함
        for (char x: str.toCharArray()) {
            //알파벳 갯수를 카운팅
            //x의 키값을 가져오는데 키값이 없으면 value 값에 0을 리턴
            //키값이 있으면 원래 value 값에 +1
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

//        System.out.println(map.containsKey('F')); //key 포함여부
        System.out.println(map.size()); //key 갯수
        System.out.println(map.remove('A')); //특정 키를 삭제하고 value 값 리턴
        System.out.println(map.size());

        for(char key : map.keySet()){
            //map의 모든 key, value 출력하기
            //key: key 값, map.get(key): key 값에 해당하는 value를 얻는다
//            System.out.println(key + " " + map.get(key));

            if(map.get(key) > max){
                max = map.get(key);
                answer=key;
            }
        }

        return answer; //학급 회장으로 선택된 기호
    }


    public static void main(String[] args) {
        Main_32 main = new Main_32();
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt(); //학생 수
        String str = sc.next(); //투표용지에 쓰여있던 각 기호

        System.out.println(main.solution(n, str));

    }
}
