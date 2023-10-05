package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.GongCho.sw
 * fileName       : Solution1204
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-05        qkrtn_ulqpbq2       최초 생성
 */
public class Solution1204 {

    static int t, test_case;
    static Integer[] bindo, bindo2;
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            test_case = Integer.parseInt(br.readLine());
            bindo = new Integer[101];
            bindo2 = new Integer[101];
            for(int j=0; j<=100; j++){
                bindo[j] = 0;
                bindo2[j] = 0;
            }
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<1000; j++){
                String a = st.nextToken();
                int grade = Integer.parseInt(a);
                bindo[grade] += 1;
                bindo2[grade] += 1;
            }
            Arrays.sort(bindo, Collections.reverseOrder());
            int ans = 0;
            for(int j=100; j>0; j--){
                if(bindo[0].equals(bindo2[j])){
                    ans = j;
                    break;
                }
            }
            sb.append("#" + (test_case) + " " + ans).append('\n');
        }
        System.out.println(sb);
    }
}
