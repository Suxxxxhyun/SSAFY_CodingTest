package saffy.pg;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : saffy.pg
 * fileName       : Solution178871
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-25        qkrtn_ulqpbq2       최초 생성
 */
public class Solution178871 {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        Map<String, Integer> now = new HashMap<String, Integer>();
        Map<Integer, String> now_name = new HashMap<Integer, String>();
        for(int i=0; i<players.length; i++){ //5만-
            now.put(players[i], i+1);
            now_name.put(i+1, players[i]);
        }
        //10만
        int grade = 0;
        for(int i=0; i<callings.length; i++){
            grade = now.get(callings[i]); //4
            String name = now_name.get(grade - 1); // poe
            now.put(name, grade); // poe 4
            now.put(callings[i], grade - 1); // kai 3
            now_name.put(grade - 1,callings[i]); // 3 kai
            now_name.put(grade, name); // 4 poe
        }
        for(int i=1; i<players.length + 1; i++){
            answer[i-1] = now_name.get(i);
        }
        return answer;
    }
}
