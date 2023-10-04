package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.bj
 * fileName       : Main8958
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-25        qkrtn_ulqpbq2       최초 생성
 */
public class Main8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] arr = new String[t];
        for(int i=0; i<t; i++){
            arr[i] = br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t; i++){
            int cnt = 0, sum = 0;
            for(int j=0; j<arr[i].length(); j++){
                if(arr[i].charAt(j) == 'O'){
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);

    }
}
