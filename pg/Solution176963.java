package saffy.pg;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : saffy.pg
 * fileName       : Solution176963
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-25        qkrtn_ulqpbq2       최초 생성
 */
public class Solution176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> grade = new HashMap<String, Integer>();
        for(int i=0; i<yearning.length; i++){
            grade.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];

        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(int j=0; j<photo[i].length; j++){
                if(grade.containsKey(photo[i][j])){
                    sum += grade.get(photo[i][j]);
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}
