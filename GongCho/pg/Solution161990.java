package saffy.GongCho.pg;

/**
 * packageName    : saffy.pg
 * fileName       : Solution161990
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-25        qkrtn_ulqpbq2       최초 생성
 */
public class Solution161990 {
    //파일이 있는 좌표, (0,1), (1,2), (2,3) -> 0.1 3.4
    //(1,5), (2,6), (2,7), (3,3), (3,4), (4,4) -> 1.3 5.8
    public int[] solution(String[] wallpaper) {
        int[] answer;
        int lux = Integer.MAX_VALUE, luy = Integer.MAX_VALUE,
                rdx = Integer.MIN_VALUE, rdy = Integer.MIN_VALUE;
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    lux = Math.min(lux, i); //X중에서 가장 작은 X값
                    luy = Math.min(luy, j); //Y중에서 가장 작은 Y값
                    rdx = Math.max(rdx, i); //x중에서 가장 큰 x값
                    rdy = Math.max(rdy, j); //y중에서 가장 큰 y값
                }
            }
        }
        answer = new int[] {lux, luy, rdx + 1, rdy + 1};
        return answer;
    }
}
