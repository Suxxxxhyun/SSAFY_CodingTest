package saffy.GongCho.pg;

/**
 * packageName    : saffy.pg
 * fileName       : Solution172928
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-25        qkrtn_ulqpbq2       최초 생성
 */
public class Solution172928 {

    static int startX = 0, startY = 0;
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        //시작지점구하기 - 2500 (0,0)
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    startX = i;
                    startY = j;
                    break;
                }
            }
        }
        int x = startX , y = startY;
        System.out.println("시작지점 : " + x + "," + y);
        int nx = x, ny = y;
        for(int i=0; i<routes.length; i++){
            char direction = routes[i].charAt(0); // E
            int dist = Integer.parseInt(String.valueOf(routes[i].charAt(2)));
            while(dist > 0){
                if(direction == 'N'){
                    nx -= 1;
                } else if(direction == 'S'){
                    nx += 1;
                } else if(direction == 'W'){
                    ny -= 1;
                } else {
                    ny += 1;
                }
                if(nx < 0 || ny < 0 || nx >= park.length || ny >= park[0].length()){
                    nx = x;
                    ny = y;
                    break;
                }
                if(park[nx].charAt(ny) == 'X'){
                    System.out.println("x걸림1 : " + nx + "," + ny);
                    nx = x;
                    ny = y;
                    System.out.println("x걸림2 : " + nx + "," + ny);
                    break;
                }
                dist--;
            }
            x = nx;
            y = ny;
            System.out.println("이동 : " + x + "," + y);
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}
