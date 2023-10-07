package saffy.GongCho.sw;

/**
 * packageName    : saffy.GongCho.sw
 * fileName       : Solution1970
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-07        qkrtn_ulqpbq2       최초 생성
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1970 {

    static int t;
    static StringBuilder sb = new StringBuilder();
    static int[] money;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            money = new int[8];
            int n = Integer.parseInt(br.readLine());
            sb.append("#" + i).append('\n');
            if(n >= 50000) {
                int val = n / 50000;
                money[0] += val;
                n = n - (val * 50000);
            }
            if(n >= 10000 && n < 50000) {
                int val = n / 10000;
                money[1] += val;
                n = n - (val * 10000);
            }
            if(n >= 5000 && n < 10000) {
                int val = n / 5000;
                money[2] += val;
                n = n - (val * 5000);
            }
            if(n >= 1000 && n < 5000) {
                int val = n / 1000;
                money[3] += val;
                n = n - (val * 1000);
            }
            if(n >= 500 && n < 1000) {
                int val = n / 500;
                money[4] += val;
                n = n - (val * 500);
            }
            if(n >= 100 && n < 500) {
                int val = n / 100;
                money[5] += val;
                n = n - (val * 100);
            }
            if(n >= 50 && n < 100) {
                int val = n / 50;
                money[6] += val;
                n = n - (val * 50);
            }
            if(n < 50){
                int val = n / 10;
                money[7] += val;
                n = n - (val * 10);
            }
            for(int j=0; j<8; j++) {
                sb.append(money[j] + " ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

}

