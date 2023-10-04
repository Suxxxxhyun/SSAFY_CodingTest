package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main1546
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        qkrtn_ulqpbq2       최초 생성
 */
//10:52 ~ 11:00
public class Main1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        double max = arr[arr.length-1];
        for(int i=0; i<n; i++){
            arr[i] = (arr[i] / max) * 100;
        }

        double sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        System.out.println(sum / arr.length);
    }
}
