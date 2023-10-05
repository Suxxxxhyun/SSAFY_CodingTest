package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.GongCho.sw
 * fileName       : Solution1974
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-05        qkrtn_ulqpbq2       최초 생성
 */
public class Solution1974 {

    static int t;
    static int[][] map;
    static int[] num;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            map = new int[10][10];
            boolean confirm = true;
            for(int j=0; j<9; j++){
                st = new StringTokenizer(br.readLine(), " ");
                num = new int[10];
                int a = 0;
                for(int k=0; k<9; k++){
                    a = Integer.parseInt(st.nextToken());
                    map[j][k] = a;
                    num[a] += 1;
                    if(num[a] >= 2){
                        confirm = false;
                        break;
                    }
                }
            }
            sb.append("#" + i + " ");
            if (!confirm) {
                sb.append(0).append('\n');
            } else {
                if(!row_confirm()){
                    sb.append(0).append('\n');
                    num = new int[10];
                } else {
                    if(pro()){
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                };
            }
        }
        System.out.println(sb);
    }

    static boolean row_confirm(){
        for(int col=0; col<9; col++){
            num = new int[10];
            for(int row=0; row<9; row++){
                num[map[row][col]] += 1;
                if(num[map[row][col]] >= 2){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean pro(){
        for(int k=0; k<7; k+=3){
            for(int l=0; l<7; l+=3){
                num = new int[10];
                for(int i=k; i<k+3; i++){
                    for(int j=l; j<l+3; j++){
                        num[map[i][j]] += 1;
                        if(num[map[i][j]] >= 2){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
