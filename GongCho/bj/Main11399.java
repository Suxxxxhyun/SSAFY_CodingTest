package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main11399
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        qkrtn_ulqpbq2       최초 생성
 */
// 3 1 4 3 2
public class Main11399 {

    static int n;
    static int[] a, result;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        a = new int[n];
        result = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        result[0] = a[0];
        for(int i=1; i<n; i++){
            result[i] = result[i-1] + a[i];
        }

        int sum = 0;
        for(int i=0; i<n; i++){
            sum += result[i];
        }
        System.out.println(sum);
    }
}
